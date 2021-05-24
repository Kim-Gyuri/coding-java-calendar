package Scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Calendar {

    private HashMap<Date, String> planMap;
    public Calendar() {
        planMap = new HashMap<Date, String>();
    }

    public void registerPlan(String theDate, String theList){

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(theDate);
            planMap.put(date, theList);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public String searchPlan(String theDate) throws ParseException {

            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(theDate);
            String plan = planMap.get(date);
            return plan;

    }


    public static int getDaysOfMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
    }


    public void printCalendar(int year, int month) {

        int sum = 0;

        for (int i = 1583; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                // 윤년이라면
                sum += 2;
            } else {
                // 평년이라면
                sum += 1;
            }
        }

        int first = (sum + 6) % 7; // 입력한 year의 1월 1일의 요일

        for (int j = 1; j < month; j++) {
            first += getDaysOfMonth(year, j) % 7;
        }

        int day = first % 7; // 입력한 month의 1일의 요일
        int num = 1; // month의 일 표시
        int max = getDaysOfMonth(year, month); // 해당 month가 가지는 최대 일 수
        boolean start = false;

        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");

        loop:
        for (int row = 0; row <= 5; row++) {
            for (int column = 0; column <= 6; column++) {
                if (row == 0 && !start) {
                    // 달력의 첫 행
                    if (column == day) {
                        // 시작 일에 도달하면
                        start = true;
                    } else {
                        // 시작 일에 도달 전에는 공백
                        System.out.print("     ");
                        continue;
                    }
                }

                System.out.printf("  %02d ", num);
                num++;

                if (num > max) {
                    // 최대 일 수에 도달하면 break loop
                    break loop;
                }
            }
            System.out.println("");
        }
    }
}

