package Day9_String;

public class Topic1_String {
    public static void main(String[] args) {

        /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.
            String name = "hsgdjahsdknaksdn";

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            String str= "Class"; // Pool
            String str2 = "Class";
            2.By new keyword
            String str1 = new String("Class1"); // heap memory
            String str4 = new String("Class1");
        */
        //create an string object
        // 1.By string literal
        //Java String literal is created by using double quotes.
        // For Example:
        //String str1="Hello";

        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool./*
        //            in Java, string is an object that represents a sequence of characters.
        //            The java.lang.String class is used to create a string object.
        //            String name = "hsgdjahsdknaksdn";
        //
        //            How to create a string object?
        //            There are two ways to create String object:
        //
        //            1.By string literal
        //            String str= "Class"; // Pool
        //            String str2 = "Class";
        //            2.By new keyword
        //            String str1 = new String("Class1"); // heap memory
        //            String str4 = new String("Class1");
        //        */
        //        //create an string object
        //        // 1.By string literal
        //        //Java String literal is created by using double quotes.
        //        // For Example:
        //        //String str1="Hello";
        //
        //        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        //        // If the string already exists in the pool, a reference to the pooled instance is returned.
        //        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        String andy="Hello";
        String andrew="Hello";
        String sena=new String("Hello");
        String ziya=new String("Hello");
        boolean isEqual=(andrew==andy);
        boolean isEqual2=(andrew==sena);
        boolean isEqual3=(sena==ziya);
        System.out.println("are they equal: "+isEqual);
        System.out.println("are the others equal: "+isEqual2);
        System.out.println("are the equal: "+isEqual3);














    }
}
