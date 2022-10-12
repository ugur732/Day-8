package Day7_SwitchStatements;

public class Topic2_SwitchStatements {
    public static void main(String[] args) {

        /*
        variable=name
        switch(name){
        case value:
         code block;
         break; // not mandatory

         case value1:
         code block;
         break;
         default: Code Block
        }
         */

        // write a code where it prints the name of the day based on the weeks day

        int day=6;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekends");
        }
















    }
}
