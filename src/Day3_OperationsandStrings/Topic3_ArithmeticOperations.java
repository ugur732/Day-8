package Day3_OperationsandStrings;

public class Topic3_ArithmeticOperations {
    public static void main(String[] args) {

        //(+) Addition
        int num1=90;
        int num2=80;
        int num3=num1+num2;
        System.out.println("The result is:" + num3);
        System.out.println(num1+num2);
        System.out.println("This is the result in different way: " + num1+num2);
        System.out.println("This is the result in different way: " + num2+num1);
        System.out.println("This is the result in different way: " + (num1+num2));

        int num4=300;
        float num5=98.56f;
      float num6=num4+num5;
        System.out.println("The result is: " +num6);

        double num7= 98.7654;
        int num8= 900;
        double num9=num7+num8;
        System.out.println("The result for double is=" +num9);

        //(-) subtraction

        int num10= 67;
        int num11=9000;
        int result=num10-num11;
        System.out.println(result);

        //(*) multiplication

        int num12=95;
        int num13=98;
        int result1=num12*num13;
        System.out.println("The result of multi is:" +result1);


        double num14=89.3214;
        double num15=87;
        double result2=num14*num15;
        System.out.println("The result is:" + result2);


        // (/) division

        int num16=89;
        int num17=40;
        int nresult= num16/num17;
        System.out.println(nresult);

        int num18=89;
        int num19=40;
        float nresultt= (float)num18/num19;
        System.out.println(nresultt);

        int num20=89;
        int num21=40;
        double nresulttt= (double)num18/num19;
        System.out.println(nresulttt);

        //(%) modules (mod)// get the reminder of the division

        int num22=98;
        int num23=3;
        int num24=num22%num23;
        System.out.println("result of mod:" + num24);

        double num25=90.45;
        double num26=8.56;
        double modresult=num25%num26;
        System.out.println("the mod result of double is:" + modresult);


        int n=40;
        int m=20;
        int v=n/m;
        System.out.println(v);















    }
}
