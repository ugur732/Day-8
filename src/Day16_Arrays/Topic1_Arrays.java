package Day16_Arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {

        int[] array1={78,23,91,34};

        // in arrays index starts from 0
        int[] array2={  67,           90,            28,          10};
        // the index;  index0       index1         index2        index3

        // if i want to get number in index 0, ==> array2[0]
        System.out.println("the first number is: "+array2[0]);
        System.out.println("the first number is: "+array2[2]);

        int var3=array2[2];
        System.out.println("var3 = " + var3);

        // Boolean data type arrays

        boolean[] boolArray={true,false,true,true};
        System.out.println("boolArray = " + boolArray[3]);
        boolean var=boolArray[1];
        System.out.println("var = " + var);

        // double data type arrays

        double DobArray[]={90,65.787,23};
        System.out.println("DobArray[0] = " + DobArray[0]);

        // String arrays

        String[] stringArray={"Cheasus","Harak","Ziya","Nelly",null};
        System.out.println("stringArray = " + stringArray[3]);
        System.out.println("stringArray = " + stringArray[4]);





















    }
}
