package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic4_ReverseString {
    public static void main(String[] args) {

         // Reverse the String

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a name: ");
        String input=scan.nextLine();
        char ch=input.charAt(0);
        System.out.println(ch);
        System.out.println(input.length());
        System.out.println("the last character: "+input.charAt(input.length()-1));
        String reverse="";
        for (int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);

        }
        System.out.println(reverse);














    }
}
