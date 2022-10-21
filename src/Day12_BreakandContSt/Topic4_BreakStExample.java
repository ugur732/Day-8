package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakStExample {
    public static void main(String[] args) {

        // User is being asked to enter a name restructure the name but as soon as it sees the "l"
        // you should stop restructure
        // Kyle==> Ky

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a name: ");
        String name= scan.next();

        String rename="";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='l'){
                break;

            }
            rename=rename+name.charAt(i);
        }
        System.out.println(rename);










    }
}
