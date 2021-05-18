package calendar;

import java.util.Scanner;

public class GetMaxDays_v3 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("반복할 횟수를 적으시오. " );
        int count = sc.nextInt();


        try {
            for(int i=0; i<count; i++) {
                System.out.print("월을 입력하시오.");
                int count_month = sc.nextInt();
                System.out.printf( "%d월은 %d일까지 있습니다.",count_month,MAX_DAYS[count_month-1]);
            }

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
