package Day15_NestedLoops;

public class Topic6_BreakStatement {
    public static void main(String[] args) {

        lbl:
        for (int i = 0; i <10 ; i++) {
            System.out.println("from Outer Loop i value: "+i);
            for (int j = 1; j <10 ; j++) {
                if (i==5){
                break lbl;
                }
                System.out.println(" \t from the Inner Loop i value: "+i+" j value: "+j);
            }


        }




















    }
}
