package Day5_IfElseStatements;

public class Topic6_IfElseExamples {
    public static void main(String[] args) {

        //check if a student will be accepted to school
        // 1-SAT score must be 90 or more
        // 2-writing skill 5 or above

        double stScore=89;
        int wrScore=7;

        if (stScore>=90 && wrScore>=5){
            System.out.println("student is accepted");
        }
        else {
            System.out.println("student is rejected");
        }


        //check if the water is boiling

        double bPoint=100;  //in C
        double temp=90;
        if (temp==bPoint){
            System.out.println("water is boiling");
        }
        else {
            System.out.println("water is not boiling");
        }












    }
}
