package calendar;

import java.util.Scanner;

public class CalendarVirtual1 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        String PROMPT =">";
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("달을 입력하시오.");
            System.out.print(PROMPT);
            int month = sc.nextInt();
            if (month ==-1){
                System.out.println("Bye~");
                break;
            }
            if (month >12) {
                continue;
            }
            System.out.println("일\t월\t화\t수\t목\t금\t토");
            System.out.println("--------------------------");
            for(int i=1; i<MAX_DAYS[month-1]+1; i++) {
                System.out.printf("%d\t", i);
                if(i%7==0){
                    System.out.println();
                }

            }
            System.out.println();
        }

    }
}
