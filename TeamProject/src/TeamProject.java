import javax.swing.*;
import java.nio.channels.FileChannel;
import java.text.*;

public class TeamProject {
    public static Double iCharge, cTip, cTax, cTotal;
    public static String iData, oTotal, oTax, oTip, oCharge;

    public static void main(String[] args){

        init();
        input();
        calcs();
        output();

    }
    public static void init(){
        JOptionPane.showMessageDialog(null,"Hello, this will tell you costs and things.", "Hello",
                1);
    }


    private static void input() {

        iData = JOptionPane.showInputDialog(null,"Enter food cost: ", "Charges",
                1);
        iCharge = Double.parseDouble(iData);
    }

    private static void calcs() {
        cTip = .15 * iCharge;
        cTax = iCharge * .07;
        cTotal = cTip + cTax + iCharge;
    }

    private static void output() {
        String pattern = "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);

        oTip = moneyFormat.format(cTip);
        oTax = moneyFormat.format(cTax);
        oTotal = moneyFormat.format(cTotal);
        oCharge = moneyFormat.format(iCharge);


        JOptionPane.showMessageDialog(null,"Charge: "+ oCharge + "\nYour tip is: "+ oTip+
                "\nSales Tax is: "+ oTax+ "Total is: "+ oTotal, "Totals",
                1);


    }

}

