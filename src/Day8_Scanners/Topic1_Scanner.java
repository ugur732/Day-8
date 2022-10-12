package Day8_Scanners;

import java.util.Scanner;

public class Topic1_Scanner {
    public static void main(String[] args) {

        // next()==> it will read a word from the console
        // Java Class
        // nextLine()==>
        // Java Class
        // is Fun

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName=scan.next();
        System.out.println("Your firstname is: "+firstName);
        System.out.println("please enter your age");
        String age= scan.next();
        System.out.println("your age is: "+age);
        System.out.println("please enter your zip code: ");
        String zipcode= scan.next();
        System.out.println(age+zipcode);















    }
}
