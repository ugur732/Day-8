package Day12_BreakandContSt;

public class Topic3_BreakExample {
    public static void main(String[] args) {

        // write a code where when speed limit is hit stabilize the speed at the speed limit
        // the speed limit is 75
        int speed=0;
        for (int i = 0; i <170 ; i++) {
            speed+=1;  // speed=speed+1;
            if (speed==75){
                break;
            }

        }
        System.out.println(speed);







    }
}
