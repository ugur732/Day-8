import java.sql.SQLOutput;
import java.util.Scanner;
public class Examples {
    public static void main(String[] args) {


 Scanner scan=new Scanner(System.in);
        System.out.println("enter a name: ");
        String name=scan.next();
        if (name.endsWith("l")&& name.startsWith("A")) {
            String replace = name.replace('A', 'B');
            System.out.println(replace);
        }else{
            System.out.println("invalid name");
        }









    }
}
