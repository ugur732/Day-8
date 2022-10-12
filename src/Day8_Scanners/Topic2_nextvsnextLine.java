package Day8_Scanners;

import java.util.Scanner;

public class Topic2_nextvsnextLine {
    public static void main(String[] args) {

        // next()==> it will read a word from the console it will stop at the space
        // Java Class (just Java will be scanned)
        // nextLine()==>it reads the whole line on the console. Ot will stop at the next line
        // Java Class (whole line java class will be scanner)

       Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first name and last name ");
        String name=sc.nextLine();
        System.out.println("your first and last name is:"+name);
        System.out.println("Please enter your phone number");
        String phone=sc.nextLine();
        System.out.println("your name is: "+name+" your phone number is: "+phone);
















    }
}
