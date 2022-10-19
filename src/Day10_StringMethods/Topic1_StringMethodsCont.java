package Day10_StringMethods;

import java.sql.SQLOutput;

public class Topic1_StringMethodsCont {
    public static void main(String[] args) {

       /* Method	              Description                                                     	Return Type
        charAt()	          Returns the character at the specified index (position)	        char
        concat()	          Appends a string to the end of another string	                    String
        contains()	          Checks whether a string contains a sequence of characters	        boolean
        endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
        equals()	          Compares two strings. Returns true if the strings are equal,
        and false if not	                                                boolean
        equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
        indexOf()	          Returns the position of the first found occurrence
        of specified characters in a string	                            int
        isEmpty()	          Checks whether a string is empty or not	                        boolean
        lastIndexOf()	      Returns the position of the last found occurrence of
        specified characters in a string	                                int
        length()	          Returns the length of a specified string	                        int
        replace()	          Searches a string for a specified value, and returns
        a new string where the specified values are replaced	            String
        replaceFirst()	      Replaces the first occurrence of a substring that matches the
        given regular expression with the given replacement	            String

        startsWith()	      Checks whether a string starts with specified characters	        boolean
        substring()	          Extracts the characters from a string,
        beginning at a specified start position,
        and through the specified number of character	                    String
        toLowerCase()	      Converts a string to lower case letters	                        String
        toUpperCase()	      Converts a string to upper case letters	                        String
        trim()	              Removes whitespace from both ends of a string	                    String

                */

        // replace()

        String name="Ziya";

        String rename=name.replace('Z','Y');
        System.out.println(rename);                           // Yiya
        name=name.replace('y','x');
        System.out.println(name);                            // Zixa

        String name1="Andrew";
        String Rename1=name1.replace("An","EX");
        System.out.println(Rename1);                               //EXdrew
        String Rename2=name1.replace("And","EX");
        System.out.println(Rename2);                               //EXrew
        String Rename3=name1.replace("And","EXxcx");
        System.out.println(Rename3);                              //EXxcxrew

        // replaceFirst()

        String name2="AmerAmAm";
        String rename1=name2.replaceFirst("Am","Pn");
        System.out.println(rename1);                             //PnerAmAm


        // startsWith()

        String name3="Eloise";
        boolean checkname3=name3.startsWith("E");
        System.out.println(checkname3);              //true

        //substring()

        String name4="Diana";
        String subname4=name4.substring(2);
        System.out.println(subname4);                    //ana
        System.out.println("********************************");
        String name5="AliEkinci";
        String subname5=name5.substring(2,7);
        System.out.println(subname5);                    //iEkin


        // toLowerCase()
        String name6="UGUR KARADAG";
        System.out.println(name6.toLowerCase());

        //toUpperCase()
        String name7="ugur karadag";
        System.out.println(name7.toUpperCase());

        // trim()
        String name8=" Cihan Sahin ";
        System.out.println(name8.trim());
        System.out.println(name8);











    }
}
