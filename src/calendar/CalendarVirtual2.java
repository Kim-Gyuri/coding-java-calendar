package calendar;

public class CalendarVirtual2 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final static int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int getDaysOfMonth( int month) {
        return MAX_DAYS[month-1];
    }

    public void printCalendar(int year, int month) {
        System.out.printf("\t\t<%4d %3d월>\n", month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("--------------------------");

        int maxDay = getDaysOfMonth(month);
        for(int i=1; i<=maxDay; i++){
            System.out.printf("%d\t",i);
            if(i%7==0){
                System.out.println();
            }
        }

    }



}

