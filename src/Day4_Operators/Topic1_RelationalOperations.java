package Day4_Operators;

public class Topic1_RelationalOperations {
    public static void main(String[] args) {

        boolean check= 2==8;
        System.out.println("The result is: " + check);

        int a=90;
        int b=110;
        boolean chcek1= a==b;
        System.out.println("is a equal to be: "+chcek1);

        boolean check2= 20==20;
        System.out.println(check2);


        //  "<"

        boolean check3= 60<110;
        System.out.println("is 60 less than 110: "+ check3);

        //  ">"

        boolean check4= 90>4000;
        System.out.println("is 90 greater than 4000: " + check4);

        //   "<=" less than or equal

        boolean check5= 100<=500;
        System.out.println("is 100 less than 500 or equal to 500: "+check5);

        boolean check6= 900<=900;
        System.out.println("result: "+check6);

        //  ">=" greater than or equal

        boolean check7= 956>=120;
        System.out.println("resul1"+ check7);


        //  "!=" check if 2 things are not equal,

        boolean check8=90!=90;
        System.out.println("Not equal: "+check8);


        //   "!"  convert to opposite value

        boolean check9=234 !=789;
        System.out.println(check9);

        boolean check10= !(234 !=789);
        System.out.println(check10);

        boolean check11=((90==23))==!(98>98);
        System.out.println(check11);











    }
}
