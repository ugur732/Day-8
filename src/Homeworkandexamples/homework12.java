package Homeworkandexamples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName= scan.nextLine();
        System.out.println("Last Name: ");
        String lastName= scan.nextLine();
        System.out.println("Exam score: ");
        double scr=scan.nextDouble();
        if (scr>=90 && scr<=100){
            System.out.println("Your grade is A");
        } else if (scr>=80 && scr<90) {
            System.out.println("Your grade is B");
        } else if (scr>=70 && scr<80) {
            System.out.println("Your grade is C");
        }else if (scr>=60 && scr<70){
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }


    }
}