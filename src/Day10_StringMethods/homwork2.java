package Day10_StringMethods;

import java.util.Scanner;

public class homwork2 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("enter a sentence:");
        String s1= scan.nextLine();
        if (s1.startsWith("B") && s1.endsWith("e") && s1.contains("a")) {
            String replace=s1.replace('u','G');
            System.out.println(replace);
        }else {
            System.out.println("invalid sentence");
        }


// blurry is a one of the color of blazer bottle





    }
}
