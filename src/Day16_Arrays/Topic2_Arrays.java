package Day16_Arrays;

public class Topic2_Arrays {
    public static void main(String[] args) {
        
        
        // we can define an array with a size but not add any values
        // DataType [] name =new DataType[size/length]
        
        int [] intArray=new int[4]; // {0,0,0,0}
        // because the default value for int is 0
        //0 is also default value for byte,short,long data type
        System.out.println("intArray[0] = " + intArray[0]);
        System.out.println("intArray[0] = " + intArray[1]);
        System.out.println("intArray[0] = " + intArray[2]);
        System.out.println("intArray[0] = " + intArray[3]);
        
        double [] doubArray=new double[3];
        // default value for double and float is 0.0
        System.out.println("doubArray[1] = " + doubArray[1]);
        
        char[] charArray=new char[4];
        System.out.println("charArray = " + charArray[1]);
        
        String [] stringArray= new String[3];
        System.out.println("stringArray[0] = " + stringArray[0]);

        // once array size or length is defined it can not be changed what you can do create another
        // array and put all the values in the new array
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
