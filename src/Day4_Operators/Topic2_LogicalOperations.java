package Day4_Operators;

public class Topic2_LogicalOperations {
    public static void main(String[] args) {

        // AND ===> "&&"

        // OR ===> "||"

        boolean checklogic= true&&true;
        System.out.println("the result is: "+checklogic);

        boolean logic1= (78==90)&&(876!=8907)&&(98>23);
        System.out.println(logic1);

        boolean logic3=false||false||false||true;
        System.out.println(logic3);

        boolean logic4=!(!(90==90)||(90!=80)||(76>90)); // !(false||true||false) ==!(true)
        System.out.println(logic4);


    }
}
