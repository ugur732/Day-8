package Day13_WhileLoop;

public class Topic3_WhileBreak {
    public static void main(String[] args) {

        // print all the numbers between 1 and 10 but when the number is 5 break

        int start=1;
        while (start<10)
        {
            System.out.println("start = " + start);
            if (start==5){
                break;
            }

            start++;
        }

        // print all the character in String value of "Nawras" but break it when there is a char 'a'

        String name="Nawras";
        int i=0;
        while (i<name.length()){
            if (name.charAt(i)=='a'){
                break;
            }
            System.out.println(name.charAt(i));
            i++;
        }















    }
}
