import javax.swing.*;

public class GUICalcsExample {
    //global Variables
    static String iStuName;
    static byte iCredits;
    static final double TUITION_RATE = 185;
    static double cTotalOwed;


    public static void main(String[] args){
        init(); //call the init method
        input();//calls input method
        calcs();//call the calcs method
        output();
    }

    /**
     * The init method creates a welcome message
     */
    public static void init(){
        JOptionPane.showMessageDialog(null, "Welcome to IHCC Tuition Calculator",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Prompts for name and credits.
     */
    public static void input(){
        //get name
        iStuName = JOptionPane.showInputDialog(null, "Enter student name:");

        //get credits and convert to integer
        String strCredits;
        strCredits = JOptionPane.showInputDialog(null, "Enter number of credits:");
        iCredits = Byte.parseByte(strCredits);
    }
    /**
     * Calculate tuition (credits * tuition rate)
     */
    public static void calcs() {
        cTotalOwed = iCredits * TUITION_RATE;
    }
    public static void output() {
        JOptionPane.showMessageDialog(null, "Hello "+ iStuName + ", "+ iCredits +
                        " credits will cost you $"+cTotalOwed,"Pay Up!", JOptionPane.INFORMATION_MESSAGE);
    }
}
