package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic1_ForLoops {
    public static void main(String[] args) {

        // write a code where user enters 2 different numbers and counts the number
        // that can be divided by 3 those are in between those number
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first integer number: ");
        int num1= scan.nextInt();
        System.out.println("Enter the second integer number");
        int num2= scan.nextInt();
        int count=0;
        for (int i=num1;i<=num2;i++){
            if (i%3==0){
                System.out.println(i);
            count++;
            }

        }
        System.out.println(count);















    }
}
