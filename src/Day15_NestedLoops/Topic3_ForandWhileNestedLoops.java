package Day15_NestedLoops;

public class Topic3_ForandWhileNestedLoops {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("this is from outer loop: "+i);
            int j=1;
            while (j<10){
                System.out.println( "\t this is from inner loop: "+ j);
                j++;
            }
            System.out.println("this is from outer loop i: "+i);
            for (int k = 1; k <4 ; k++) {
                System.out.println("\t this is from inner  FOR LOOP k value: "+k);
                System.out.println("\t this is J value inside of the FOR LOOP: "+j);
            }

        }














    }
}
