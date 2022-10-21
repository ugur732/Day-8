package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExample1 {
    public static void main(String[] args) {

        // write a code where it counts all the even numbers in between 2 numbers those have been
        //entered by user
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1= scan.nextInt();
        System.out.println("enter the second number: ");
        int number2= scan.nextInt();
int cnt=0;
int cnt1=0;
        for (int i=number1;i<number2;i++){
if (i%2==0){
    System.out.println(i);
    cnt++;
}else{

    cnt1++;
}

        }System.out.println("even:"+cnt);
        System.out.print("odd:"+cnt1);












    }
}
