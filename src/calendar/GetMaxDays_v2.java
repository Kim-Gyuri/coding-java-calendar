package calendar;

import java.util.Scanner;

public class GetMaxDays_v2 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.printf( "%d월은 %d일까지 있습니다.",input,MAX_DAYS[input-1]);

    }


}
