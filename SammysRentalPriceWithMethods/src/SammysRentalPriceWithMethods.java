import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SammysRentalPriceWithMethods {


    public static void main(String[] args){
        displaySplash();
        int iMinutes = input();
        process(iMinutes);
    }

    public static void displaySplash() {

        SammysRentalPrice.init();
    }

    public static int input() {
        Scanner inputDevice = new Scanner(System.in);
        int iRentedMin;
        System.out.print("Enter number of minutes equipment was rented for: ");
        return inputDevice.nextInt();
    }
    public static void process(int Mins) {
        int cMin=0, cHour=0;
        double CTotalCharge;
        cHour = Mins /60;
        cMin = Mins % 60;
        CTotalCharge = cMin + (cHour * 40);
        output(cHour, cMin, CTotalCharge);
    }
    public static void output(int hours, int mins, double charge){
        String pattern = "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        String oTotalCharge = moneyFormat.format(charge);
        if(hours > 0){
            System.out.println("Hours Rented: "+hours+ " @ $40 ea.");
        }
        System.out.println("Minutes Rented: "+mins+" @ $1 ea."+"\nTotal Due: "+oTotalCharge);
    }
}
