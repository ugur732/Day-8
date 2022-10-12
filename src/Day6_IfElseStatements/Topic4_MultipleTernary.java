package Day6_IfElseStatements;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {

        /*
        (condition)?first:(condition)?:second:(condition)?third:forth;
         */

        // write a code where it checks if number is even or odd or zero
        //(a%2==0)?"the number is even":(a%2==0)?"the number is odd:"the number is 0;

        int number= 81;
        String result=(number%2==0)?"the number1 is even":(number%2!=0)?"the number is odd":"the number is 0";
        System.out.println(result);










    }
}
