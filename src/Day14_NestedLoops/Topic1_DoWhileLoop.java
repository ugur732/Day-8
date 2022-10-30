package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhileLoop {
    public static void main(String[] args) {

        // do {
        // Code Block
        // } while(condition)

        // print all the numbers from 1 to 10

        int i=1;
        do {
            System.out.println("the number is: "+i);
            i++;
        }while (i<10);

        // write a code where user is being asked to enter a letter string but
        // even if the string has more than 1 char print only the first char

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a letter string: ");
        String st= scan.nextLine();
        int j=0;
        do {
            System.out.println("the first char of the string is: "+st.charAt(j));
          j++;
        }while (j<2);












    }
}
