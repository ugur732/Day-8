package Day13_WhileLoop;

import javax.swing.*;

public class Topic4_WhileContinue {
    public static void main(String[] args) {

        // print all the numbers between 1 and 10 except number 5,8,2

        int i=1;
        while (i<10){
            if (i==5 || i==8 || i==2){
                i++;
                continue;



            }System.out.println(i);
            i++;
        }
        System.out.println("*****************************");

        // print all he chars in the string "Nawras" except char 'a'

        String name="Nawras";
        int j=0;
        while (j<name.length()){

            if (name.charAt(j)=='a'){
                j++;
                continue;
            }
            System.out.println(name.charAt(j));
            j++;
        }






















    }
}
