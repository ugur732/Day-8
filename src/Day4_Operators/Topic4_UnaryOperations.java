package Day4_Operators;

public class Topic4_UnaryOperations {
    public static void main(String[] args) {

        // (+) does not have any effect on the value x

        int anum=900;
        anum=+900;
        System.out.println(anum);

        int anum2=-9000;
        anum2=+anum2;
        System.out.println(anum2);


        //(-) converts to opposite sign

        int anum3= -777;
        anum3= -anum3;
        System.out.println(anum3);

        int anum4= 345;
        anum4= -anum4;
        System.out.println(anum4);

        // (++) increase by 1

        int anum5=94;
        anum5++;
        System.out.println(anum5);
        anum5++;
        System.out.println(anum5);
        ++anum5;
        System.out.println(anum5);
        System.out.println(anum5++);

        //(--) decrease by 1

        int anum6= 36;
        anum6--;
        System.out.println(anum6);
        --anum6;
        System.out.println(anum6);

        //anum6 = anum6-10 = anum6-=10

        // ++variabke increase and assign


        int num7=700;

        System.out.println(--num7);




    }
}
