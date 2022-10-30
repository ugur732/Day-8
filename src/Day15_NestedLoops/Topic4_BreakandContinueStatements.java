package Day15_NestedLoops;

public class Topic4_BreakandContinueStatements {
    public static void main(String[] args) {


        for (int i = 0; i <10 ; i++) {
            if (i==5) {
                continue;
            }
            System.out.println("i = " + i);
        }
        int j=0;
        while (j<10){
            if (j==7 || j==8){
                j++;
                continue;
            }
            System.out.println("j = " + j);
            j++;
        }
        System.out.println("******************************");
        for (int i = 0; i <10 ; i++) {
            System.out.println("from outer loop the i valuse is: "+i);

            for (int k = 1; k <10 ; k++) {
                if (k==5 || k==8){
                    continue;
                }
                System.out.println("\t the outer loop k value: "+k);
            }

        }

















    }
}
