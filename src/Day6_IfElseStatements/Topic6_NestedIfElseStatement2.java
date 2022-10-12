package Day6_IfElseStatements;

import javax.print.StreamPrintService;
import javax.swing.*;

public class Topic6_NestedIfElseStatement2 {
    public static void main(String[] args) {

        // Last Names= Doe,Yilmaz,Ekinci
        //if last name is Yilmaz and the age is over 20 print the lastname and age
        //if not just print the name
        //if lastname is Doe and age is over 10 print just lastname
        //if not print the just age
        //if its Ekinci print lastname and age.

        String lastname = "Yilmaz";
        int age = 25;

        if(lastname=="Yilmaz"){
            if (age>20){
                System.out.println("The last name is: "+lastname+"the age is :"+age);
            }
            else {
                System.out.println("Just lastname; "+lastname);
            }
        } else if (lastname == "Doe") {
            if (age>10){
                System.out.println("Just the Lastname: "+lastname);
            }else {
                System.out.println("Just the Age"+age);
            }
        }else {
            System.out.println("Lastname and age"+lastname+ "Age:"+age);
        }















    }


}



















