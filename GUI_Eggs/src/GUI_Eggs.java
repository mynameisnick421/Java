import javax.swing.*;

public class GUI_Eggs {
    static int iNumEggs;
    static int cDozen=0, cLoose=0; //Variables to store numbers of dozens and loose eggs
    static double DozenPrice = 3.25;
    static double LoosePrice = .45;
    static double cDozenTotalCost, cLooseTotalCost, cTotalCost; //Variables to store total costs

    public static void main(String[] args){
        init();
        input();
        calcs();
        output();
    }
    /**
     * init displays welcome message
     */
    private static void init() {
        JOptionPane.showMessageDialog(null, "Thanks for choosing GUI eggs to meet all of your egg needs!",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Prompts for num of eggs ordered
     */
    private static void input() {
        String StrNumEggs;
        StrNumEggs = JOptionPane.showInputDialog(null, "Enter number of eggs to be purchased:");
        iNumEggs = Integer.parseInt(StrNumEggs);
    }

    /**
     * determines num of dozens and loose eggs
     * determines prices of each
     * assigns values to variables
     */
    private static void calcs() {
        cDozen = iNumEggs / 12;
        cDozenTotalCost = cDozen * DozenPrice;
        cLoose = iNumEggs % 12;
        cLooseTotalCost = cLoose * LoosePrice;
        cTotalCost = cDozenTotalCost + cLooseTotalCost;
    }

    /**
     * Displays order details and totals
     */
    private static void output() {
        if(cDozen >0 & cLoose > 0){
            JOptionPane.showMessageDialog(null, "You ordered "+ iNumEggs+" eggs. That's "+
                    cDozen+" dozen at $"+cDozenTotalCost+ " and "+cLoose+ " loose eggs at $"+cLooseTotalCost,
                    "Order Details", JOptionPane.INFORMATION_MESSAGE);
        }else if (cDozen > 0){
            JOptionPane.showMessageDialog(null, "You ordered "+ iNumEggs+" eggs. That's "+
                            cDozen+" dozen at $"+cDozenTotalCost,
                    "Order Details", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "You ordered "+ iNumEggs+" eggs. That's "+
                            cLoose+ " loose eggs at $"+cLooseTotalCost,
                    "Order Details", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Your total comes to $"+cTotalCost,
                "Final Total", JOptionPane.INFORMATION_MESSAGE);
    }
}