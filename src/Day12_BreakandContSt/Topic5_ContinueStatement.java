package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic5_ContinueStatement {
    public static void main(String[] args) {


        // write a code where user is being asked to enter a name restructure the name to not contain
        // 'l' or 'L'
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a name: ");
        String name= scan.next();
        String rename="";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='l'|| name.charAt(i)=='L'){
                continue;
            }
            rename=rename+name.charAt(i);

        }System.out.println(rename);










    }
}
