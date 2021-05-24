package Scheduler;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

    public void printMenu() {
        System.out.println("+----------------------+");
        System.out.println("   | 1. 일정 등록   ");
        System.out.println("   | 2. 일정 검색   ");
        System.out.println("   | 3. 달력 보기   ");
        System.out.println("   | h. 도움말 q. 종료   ");
        System.out.println("+----------------------+");
    }


    public void runPrompt() throws ParseException {

        printMenu();

        Scanner sc = new Scanner(System.in);
        Scheduler.Calendar cal = new Scheduler.Calendar();



        while (true) {

            System.out.println("명령 (1, 2, 3, h, q)");
            System.out.print("> ");

            String menuNum = sc.next();

            if( menuNum.equals("1")) RegisterSche(sc, cal);
            else if (menuNum.equals("2")) SearchSche(sc, cal);
            else if (menuNum.equals("3")) CheckSche(sc, cal);
            else if (menuNum.equals("h")) menual();
            else if (menuNum.equals("q")) break;

        }
    }

    private void RegisterSche(Scanner sc, Scheduler.Calendar cal) {

        System.out.println("[일정 등록]");
        System.out.println(" 날짜를 입력하세요.(ex.2020-01-01)\n> ");
        String theDate = sc.next();
        System.out.print("일정을 입력하세요.\n> ");
        String theList = sc.next();
        cal.registerPlan(theDate, theList);
    }

    private void SearchSche(Scanner sc, Calendar cal) {
        System.out.println("[일정 검색]");
        System.out.println(" 날짜를 입력하세요.(ex.2020-01-01)\n> ");
        String SearchDate = sc.next();
        String prints=" ";
        try{
            prints = cal.searchPlan(SearchDate);
        }catch (ParseException e) {
            e.printStackTrace();
            System.out.println("일정 검색 중 오류가 발생하였습니다.");
        }
        System.out.println(prints);
    }




    private void CheckSche(Scanner sc,Scheduler.Calendar cal) {
        int year;
        int month;

        System.out.print("year> ");
        year = sc.nextInt();
        System.out.print("month> ");
        month = sc.nextInt();
        if(month>12 || month<0){
            System.out.println("잘못된 입력입니다.");
            return;
        }

        cal.printCalendar(year, month);
        System.out.println();
    }

    private void menual() {
        System.out.println("");
        System.out.println("<일정 관리 프로그램 도움말>");
        System.out.println("(1. 일정 등록)을 선택하시면 일정을 등록하고 싶은 날짜와 일정 내용을 입력하시면 해당 일정이 저장됩니다.");
        System.out.println("(2. 일정 검색 및 변경)을 선택하시면 검색하고 싶은 날짜를 입력하시면 해당 날짜에 저장 된 일정을 보여줍니다. 일정 변경 또한 가능합니다.");
        System.out.println("(3. 달력 보기)를 선택하시면 원하시는 년도와 월의 달력을 보여줍니다.");
        System.out.println("(h. 도움말)을 선택하시면 지금 보고 계시는 이 도움말을 보여줍니다.");
        System.out.println("(q. 종료)를 선택하시면 일정 관리 프로그램이 종료됩니다.");
        System.out.println("");
    }





    public static void main(String[] args) throws ParseException {



        //실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}