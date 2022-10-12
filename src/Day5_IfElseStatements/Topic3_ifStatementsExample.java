package Day5_IfElseStatements;

public class Topic3_ifStatementsExample {
    public static void main(String[] args) {


        int a=89;
        int b=23;
        int c=47;
        if (a>b && a>c){
            System.out.println("the highest number is: "+a);
        }
         if (b>a && b>c){
            System.out.println("the highest number is: "+b);
        }
         if (c>b && c>a){
            System.out.println("the highest number is: "+c);
        }

         if (a==b && b==c){
             System.out.println("all the number are equal");
         }








    }
}
