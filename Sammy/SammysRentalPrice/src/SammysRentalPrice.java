import javax.swing.*;
import java.text.*;
public class SammysRentalPrice {
    public static String iRentedMin, oMin, oHour, oTotalCharge;
    public static int cMin, cHour, cRentedMin;
    public static double CTotalCharge;

    public static void main(String[] args){
        init();
        input();
        calcs();
        output();
    }

    private static void init() {
        JOptionPane.showMessageDialog(null, "Thanks for choosing Sammys!!!",
                "Welcome",1);
    }

    private static void input() {
        iRentedMin = JOptionPane.showInputDialog(null, "Please enter number of minutes the equipment was rented for: ",
                "Rental",1);
        cRentedMin = Integer.parseInt(iRentedMin);
    }

    private static void calcs() {
        if(cRentedMin >= 60){
            cHour = cRentedMin /60;
            cMin = cRentedMin % 60;
        }else{
            cMin = cRentedMin;
        }
        CTotalCharge = cMin;
        if(cHour!=0){
            CTotalCharge = CTotalCharge + (cHour *40);
        }

    }

    private static void output() {
        String Motto = "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS\n\nSs     Sammy's makes it fun in the Sun     Ss\n\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS\n\n";
        String pattern = "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        oTotalCharge = moneyFormat.format(CTotalCharge);
        JOptionPane.showMessageDialog(null, Motto+"Hours Rented: "+cHour+ " @ $40"
                +"\nMinutes Rented: "+cMin+" @ $1"+"\nTotal Due: "+oTotalCharge, "Total", 1);
    }
}
