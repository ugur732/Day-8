package Day13_WhileLoop;

import java.util.Scanner;

public class Topic2_WhileCont {
    public static void main(String[] args) {

        // write a code where user is being asked to enter 2 numbers and sum all the numbers
        // in between those two numbers

        Scanner scan=new Scanner(System.in);
        System.out.println("first number: ");
        int num1= scan.nextInt();
        System.out.println("second number: ");
        int num2= scan.nextInt();
        int i;
        int j;
        int sum=0;
        if (num1>num2){
            i=num2;
            j=num1;
        }else{
            i=num1;
            j=num2;
        }
        while (i<j){
            if (i%5==0){
                sum=sum+i;

            }

           i++;

        }
        System.out.println(sum);








    }
}
