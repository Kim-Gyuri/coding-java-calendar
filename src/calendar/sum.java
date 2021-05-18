package calendar;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] case1 = {1,3,5,7,8,10, 12}; //31
        int[] case2 = {2}; //28
        int[] case3 = {4,6,9,11}; //30

       try{
           for(int i=1; i<=12; i++) {
               if (input == case1[i]) {
                   System.out.println(input + "월은 30일까지 있습니다.");
               } else if (input == case2[i]) {
                   System.out.println(input + "월은 28일까지 있습니다.");
               } else if (input == case3[i]) {
                   {
                       System.out.println(input + "월은 31일까지 있습니다.");
                   }
               }
           }
       }
       catch(IndexOutOfBoundsException e) {

           System.out.println(e);

       }
    }
}
