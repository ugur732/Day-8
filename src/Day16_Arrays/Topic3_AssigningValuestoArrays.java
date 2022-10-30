package Day16_Arrays;

public class Topic3_AssigningValuestoArrays {
    public static void main(String[] args) {

        int [] intArray={98,23,4,5,1,2,23};
       int val=intArray[4];
        System.out.println("val = " + val);

        int [] array1=new int[4]; // {0,0,0,0}
        array1[0]=78;
        System.out.println("array1 = " + array1[0]);
        array1[1]=90;
        System.out.println("array1 = " + array1[1]);
        array1[4]=12; // this is error because exception of arrayindexoutof bound because new int[4] 4 tane var icinde (0,1,2,3)


















    }
}
