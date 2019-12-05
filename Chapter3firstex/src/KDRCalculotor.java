import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;

public class KDRCalculotor {
    public static int iKills;
    public static String iData;
    public static int iDeaths;
    public static double cKDR;

    public static void main(String[] args){
        KDRSplashDisplay.displaySplash();
        input();
        calcs();
        output();
    }

    public static void output() {
        String pattern = "##.00";
        DecimalFormat df = new DecimalFormat(pattern);
        JOptionPane.showMessageDialog(null, "Your KDR is: "+ df.format(cKDR),"Get Good",1);
    }

    public static void calcs() {
        cKDR = (double)iKills/iDeaths;
    }

    public static void input() {
        iData = JOptionPane.showInputDialog(null, "Enter number of kills: ",
                "Kills Entry", 1);
        iKills = Integer.parseInt(iData);
        iData = JOptionPane.showInputDialog(null, "Enter number of Deaths: ",
                "Deaths Entry", 1);
        iDeaths = Integer.parseInt(iData);
    }


}
