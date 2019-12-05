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

    public static void init() {
        String Motto = "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS\n\nSs     Sammy's makes it fun in the Sun     Ss\n\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS\n\n";
        JOptionPane.showMessageDialog(null, Motto,
                "Welcome",1);
    }

    public static void input() {
        iRentedMin = JOptionPane.showInputDialog(null, "Please enter number of minutes the equipment was rented for: ",
                "Rental",1);
        cRentedMin = Integer.parseInt(iRentedMin);
    }

    public static void calcs() {
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

    public static void output() {

        String pattern = "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        oTotalCharge = moneyFormat.format(CTotalCharge);
        JOptionPane.showMessageDialog(null, "Hours Rented: "+cHour+ " @ $40"
                +"\nMinutes Rented: "+cMin+" @ $1"+"\nTotal Due: "+oTotalCharge, "Total", 1);
    }
}
