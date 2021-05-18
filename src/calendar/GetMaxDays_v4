package calendar;

import java.util.Scanner;

public class GetMaxDays_v4 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String PROMPT ="cal>";

        int month =1;

        while (month != -1) {
            System.out.println("달을 입력하시오.");
            System.out.print(PROMPT);
            month = sc.nextInt();
            System.out.printf( "%d월은 %d일까지 있습니다.\n", month,MAX_DAYS[month-1]);
        }
        System.out.println("Bye~");
        sc.close();

    }
}
