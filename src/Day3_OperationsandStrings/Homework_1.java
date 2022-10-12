package Day3_OperationsandStrings;

import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) {


        String firstName= "Ugur";
        String lastName= "Karadag";
        int age= 29;
        System.out.println("My First Name is: " + firstName);
        System.out.println("My Last Name is: " + lastName);
        System.out.println("My age is: " + age);




        int int1=90;
        int int2=70;
        int result=int1+int2;
        System.out.println(result);


        double a=19.05;
        double b=10.25;
        double resultt=a-b;
        System.out.println("The result of subtraction is: " + result);



        int c=15;
        int d= 2;
        int resulttt= c%d;
        System.out.println("The result of mod is: " + result);


        System.out.println(Math.max(10,5));
        System.out.println(Math.min(10.5, 2.5));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-8234));
        String txt="ABCXMNCMKASJD:LAKSDL";
        System.out.println("The length of the string txt is: " +txt.toLowerCase());
        System.out.println("The length of the string txt is: " +txt.length());


        int x=50;
        int y=50;
        if (x==y){
            System.out.println("Hello World!");}



        int num1=50;
        int num2=50;
        if (x==y){
            System.out.println("1");
        }
        else if (x>y){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }


        int [][] lotteryCard={{20,15,7},
                               {8,7,19},
                              {7,13,47}

        };
        int[][] lotteryCard2= new int[3][3];
        System.out.println(lotteryCard[0][2]);


















    }
}
