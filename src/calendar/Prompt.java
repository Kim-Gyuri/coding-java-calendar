package calendar;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        CalendarVirtual2 cal = new CalendarVirtual2();

        int month = 1;
        while (true) {
            System.out.println("month>");
            month = sc.nextInt();

            if (month ==-1) {
                break;
            }
            if (month >12) {
                continue;
            }
            cal.printCalendar(2020, month);

        }
        System.out.println("bye~");
        sc.close();
    }

    public static void main(String[] args) {
       //실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}