package Day8_Scanners;

import java.util.Scanner;

public class Topic3_ScannerExample {
    public static void main(String[] args) {

        // Write a code where it asks user to enter 3 different name (first name and last name)
        // and the age, print the person's name and age who is the oldest.

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first person's name: ");
        String name1=scan.nextLine();
        System.out.println("Please enter your age: ");
        int age1=scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter second person's name: ");
        String name2=scan.nextLine();
        System.out.println("Please enter your age: ");
        int age2=scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter third person's name: ");
        String name3=scan.nextLine();
        System.out.println("Please enter your age: ");
        int age3=scan.nextInt();

        System.out.println("The first person info==>Name:"+name1+" age "+age1);
         System.out.println("The first person info==>Name:"+name2+" age "+age2);
        System.out.println("The first person info==>Name:"+name3+" age "+age3);

        if (age1>age2 && age1>age3){
            System.out.println("The oldest one is: "+name1);
        } else if (age2>age1 && age2>age3) {
            System.out.println("The oldest one is: "+name2);
        }else {
            System.out.println("The oldest one is: "+name3);
        }


    }
}
