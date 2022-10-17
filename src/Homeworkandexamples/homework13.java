package Homeworkandexamples;

import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double fN= scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double sN= scan.nextDouble();
        System.out.println("Select the operation: ");
        double op= scan.nextDouble();
        if (op==1){
            System.out.println("Summation: "+(fN+sN));
        } else if (op==2) {
            System.out.println("Subtraction: "+(fN-sN));
        } else if (op==3) {
            System.out.println("Multiplication: "+(fN*sN));
        } else if (op==4) {
            System.out.println("Division: "+(fN/sN));
        }else {
            System.out.println("please enter a non-decimal number");
        }


    }
}