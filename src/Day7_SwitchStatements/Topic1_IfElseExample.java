package Day7_SwitchStatements;

public class Topic1_IfElseExample {
    public static void main(String[] args) {

        // write a code where students are place in the classes based on individuals  preference and knowledge

        String FirstName="Eloise";
        String Pre="QA";
        int level=3;

        if (Pre=="QA"){
           if (level==1){
               System.out.println(FirstName+"is placed in Beginner level Class for QA");
           } else if (level==2) {
               System.out.println(FirstName+"is placed in Mid level Class for QA");
           }else {
               System.out.println(FirstName+"is placed in Advance level Class for QA");
           }

        } else if (Pre=="SE") {
            if (level==1){
                System.out.println(FirstName+"is placed in Beginner level Class for SE");
            } else if (level==2) {
                System.out.println(FirstName+"is placed in Mid level Class for SE");
            }else {
                System.out.println(FirstName+"is placed in Advance level Class for SE");
            }

        }else {
            if (level==1){
                System.out.println(FirstName+"is placed in Beginner level Class for DA");
            } else if (level==2) {
                System.out.println(FirstName+"is placed in Mid level Class for DA");
            }else {
                System.out.println(FirstName+"is placed in Advance level Class for DA");
            }

        }





    }
}
