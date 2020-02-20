/**
 * This is a class that demonstrates how to use the if statement in java 1/13/2020
 */
public class IfDecisionMaking {
    public static void main(String[] args){
        int quizScore=9;
        if(quizScore == 5){
            System.out.println("You earned a golden star!");
            System.out.println("Congratulations!");
        }
        else{
            System.out.println("Better luck next time!");
            System.out.println("Please leave immediately!");
        }
        String month = "January";
        if(month.equals("January")){
            System.out.println("Winter has arrived!");
        }
        if(month.equals("January") || quizScore == 9){
            System.out.println("What a cold month for a great quiz score!");
        }


    }
}
