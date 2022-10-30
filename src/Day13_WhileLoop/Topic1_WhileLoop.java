package Day13_WhileLoop;

import java.util.Scanner;

public class Topic1_WhileLoop {
    public static void main(String[] args) {

        // write a code where user is being asked to enter 2 numbers and find how many even numbers
        // are in between those 2 numbers

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number: ");;
        int num1= scan.nextInt();
        System.out.println("enter the second number: ");
        int num2= scan.nextInt();
        int count=0;
        while (num1<num2){
            if (num1%2==0){
                count++;
            }
            num1++;
        }
        System.out.println("count = " + count);












    }
}
