package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {

        //primitive casting is to change the primitive data type but when we do the casting from
        //lower level to upper level we will have issues.
        //we put the type of data in front of it.

        byte by=40;
        System.out.println("the byte value is: "+ by);

        int inNum=(int) by;
        System.out.println("the value of int: "+ inNum);

        int a=8989898;
        short b= (short)a;
       System.out.println(b);

        int aaa=8989898;
        long bbb= (long)aaa;
        System.out.println(bbb);

        int aa=8989898;
        double bb=(double) aa;
        System.out.println(bb);

        int num1=89;
        int num2=23;
        float num3=(float)num1/num2;
        System.out.println(num3);


        int num7=89;
        int num8=23;
        double num9=(double) num1/num2;
        System.out.println(num3);

        int w=100;
        double q=w;
        System.out.println(q);

        double dd=100.7;
        int ii= (int) dd;
        System.out.println(ii);
















    }
}
