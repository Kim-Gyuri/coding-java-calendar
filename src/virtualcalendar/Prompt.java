package virtualcalendar;

import calendar.CalendarVirtual2;

import java.util.Scanner;

public class Prompt {


    public int parseDay(String str_day) {
        if (str_day.equals("su")) return 0;
        if (str_day.equals("mo")) return 1;
        if (str_day.equals("tu")) return 2;
        if (str_day.equals("we")) return 3;
        if (str_day.equals("th")) return 4;
        if (str_day.equals("fr")) return 5;
        if (str_day.equals("sa")) return 6;
        else
            return 0;
    }


    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        CalendarVirtual2 cal = new CalendarVirtual2();

        int month = 1;
        int year = 1;
        String str_day="일";

        while (true) {
            System.out.print("year> ");
            year = sc.nextInt();
            System.out.print("month> ");
            month = sc.nextInt();
            System.out.println("첫번쨰 요일을 입력하세요. (일,월,화,수,목,금,토) ");
            System.out.print("WEEKDAY> ");
            str_day = sc.next();

            int week = parseDay(str_day);

            if (month ==-1) {
                break;
            }
            if (month >12) {
                continue;
            }
            cal.printCalendar(year, month, week);

            System.out.println();
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