package virtualcalendar;

public class CalendarVirtual {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final static int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public boolean isLeapYear(int year) {

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }

    public int getDaysOfMonth(int year,int month) {
        if (isLeapYear(year)){
            return LEAP_MAX_DAYS[month-1];
        }else {
            return MAX_DAYS[month-1];
        }
    }

    public void printCalendar(int year, int month, int week) {
        System.out.printf("  \t<<%4d%3d월>>\n",year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("--------------------------");

        int maxDay = getDaysOfMonth(year,month);
        for(int j=0; j<week; j++) {
            System.out.print("\t");
            for(int i=1; i<=maxDay; i++){
                System.out.printf("%d\t",i);
                if((i+week)%7==0){
                    System.out.println();
                }
            }
        }

    }
}

