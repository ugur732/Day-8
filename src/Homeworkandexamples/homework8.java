package Homeworkandexamples;

public class homework8 {
    public static void main(String[] args) {

        String a="Ugur";
        String b="Karadag";
        int i=700;
        if (i<500){
            System.out.println(a+" "+b+" has bad credit score");
        }
        else if (i>=500 && i<700){
            System.out.println(a+" "+b+" has average credit score");
        } else if (i>=700 && i<750) {
            System.out.println(a+" "+b+" has good credit score");
        }
        else if (i>=750){
            System.out.println(a+" "+b+ " has great credit score");
        }


    }
}
