package Day9_String;

public class Topic2_StringMethods {
    public static void main(String[] args) {

        /*

Method	              Description                                                     	Return Type
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
        // charAt()
        String str1="Tanya";  // T==>0, a==>1, n==>2,
        char ch=str1.charAt(3);
        System.out.println(ch);
        System.out.println(str1.charAt(2));

        // concat()
        String firstName="ziya";
        String lastName="yilmaz";
        String fullname=firstName.concat(" "+lastName);
        System.out.println(fullname);

        // contains()
        String str3="This is a test";
        boolean con=str3.contains("x");  //false
        boolean con1=str3.contains("h");  //true
        boolean con2=str3.contains("A");  //false
        System.out.println(con);
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(str3.contains("s"));  //true

        //endsWith()
        String str4="This is the String";
        boolean ends=str4.endsWith("ing");
        boolean ends1=str4.endsWith("g");
        boolean ends3=str4.endsWith("n");
        System.out.println("String "+ends3);  //false

        //equals()
        String str5="Hello";
        String str6="Hello";
        boolean eq=str5.equals(str6);
        System.out.println(eq);               //true
        System.out.println(str5.equals(str6));  //true
        String str7= new String("Hello");
        boolean eq1=str5.equals(str7);
        System.out.println(eq1);               //true

        //equalsIgnoreCase()
        String str8="Andy";
        String str9="andy";
        boolean eq3=str8.equals(str9);
        System.out.println("are they equal: "+eq3);   //false
        boolean eq4=str8.equalsIgnoreCase(str9);
        System.out.println(eq4);            //true

        //indexOf()
        String str10="loise";
        int pos=str10.indexOf('e');
        System.out.println("the index of: "+pos);

        //lastIndexOf()
        String str11="eloeeeeiseasdef";
        int pos1=str11.lastIndexOf('e');
        System.out.println("the last index of: "+pos1);

        //isEmpty()
        String str12="";
        String str13=" ";
        System.out.println(str12.isEmpty());
        System.out.println(str13.isEmpty());

        //length()
        String str14="asddddddddddddddddddddddd";
        System.out.println(str14.length());

















    }
}
