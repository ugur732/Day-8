package Homeworkandexamples;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the first number: ");
        int num1= scan.nextInt();
        System.out.println("What is the second number: ");
        int num2= scan.nextInt();
        System.out.println("What is the third number: ");
        int num3= scan.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("The maximum number is: "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The maximum number is: "+num2);
        }else {
            System.out.println("The maximum number is: "+num3);
        }


    }
}
