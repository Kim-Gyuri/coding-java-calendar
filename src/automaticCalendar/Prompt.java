package automaticCalendar;

import java.util.Scanner;

public class Prompt {


    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();

        //입력 변수
        int month;
        int year;


        while (true) {
            //입력
            System.out.println("(exit:-1)");
            System.out.print("year> ");
            year = sc.nextInt();
            if(year==-1){
                break;
            }
            System.out.print("month> ");
            month = sc.nextInt();

            if(month>12 || month<0){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            cal.printCalendar(year, month);
            System.out.println();
        }

        sc.close();


    }

    public static void main(String[] args) {
       //실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}