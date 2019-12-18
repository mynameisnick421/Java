import javax.swing.*;

public class GUICalcsWithMethods {
    //global variables
    static final double TUITION_RATE = 185;  //LEAVE ALONE

    public static void main(String[] args){
        String iName;
        int iCredits;
        double totalOwed;
        init();         //call the init method

        iName = inputName();        //call the input name method
        iCredits = inputCredits();     //call the input credit method

        totalOwed = calcs(iCredits);        //call the calc method

        output(iName, iCredits, totalOwed);       //call the output method
    }

    /**
     * javadoc comment
     * The init method creates a welcome message
     */
    public static void init(){
        /*JOptionPane.showMessageDialog(null, "Welcome to IHCC Tuition Calculator",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);*/
        HelperMethods.DisplayWelcome();

    }

    /**
     * Prompts for and return name
     */
    public static String inputName(){
        //get name
        String inName;
        inName = JOptionPane.showInputDialog(null, "Enter student name:");
        return inName;
    }

    /**
     * Prompts for and returns credits
     */
    public static int inputCredits(){
        //get credits and convert to integer
        int inCredits;
        String strCredits;
        strCredits = JOptionPane.showInputDialog(null, "Enter number of credits:");
        inCredits = Byte.parseByte(strCredits);
        return inCredits;
    }

    /**
     * Calculate tuition (credits * tuition rate)
     */
    public static double calcs(int Credits) {
        double  totalOwed;
        totalOwed = TUITION_RATE * Credits;
        return  totalOwed;
    }

    public static void output(String iName, int iCredits, double totalOwed) {
        JOptionPane.showMessageDialog(null, "Hello " + iName + ", " + iCredits +
                        " credits will cost you $" + totalOwed,
                "Pay Up!", JOptionPane.INFORMATION_MESSAGE);

    }
}