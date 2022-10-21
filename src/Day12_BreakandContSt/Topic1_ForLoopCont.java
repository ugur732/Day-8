package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic1_ForLoopCont {
    public static void main(String[] args) {

        // Write a code where it asks user to enter 2 different numbers and sum all the even number
        // between those 2 numbers

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= scan.nextInt();
        System.out.println("Enter the second number");
        int num2= scan.nextInt();
        int start;
        int end;
        if (num1>num2){
            start=num2;
            end=num1;
        }else{
            start=num1;
            end=num2;
        }
        int sum=0;
        for (int i=start;i<end;i++){
            if (i%2==0){
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

















    }
}
