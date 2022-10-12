package Day4_Operators;

public class Topic3_AssignmentOperations {
    public static void main(String[] args) {


        int a=80;
        System.out.println(a);

        a=90;  // a value is 90 now.
        System.out.println(a);

        a=a+40;  // get a value add 40 and assign back to a; // at this point a value is 130
        System.out.println("the a value now is: "+a);


        a=a+40;
        System.out.println(a);

        a=500000;
        System.out.println(a);

        // a=a+40
        a+=40; // a=a+40
        System.out.println(a);


        int b=100;

        b=b-30;
        System.out.println(b);

        b-=10;
        System.out.println(b);

        int theanswer=b-a;
        System.out.println(theanswer);


    }
}
