import java.util.Scanner;

public class CalcSample {
    static String iName; //emp name
    static String oNetPay, oRate, oHours; // Output Variables
    static int iHours; //hours worked
    static double cNetPay; //calculated pay
    static double iRate;
    static Scanner myScanner; //input Device

    public static void main(String[] Args){
        myScanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        iName = myScanner.nextLine();

        System.out.println("Enter hours: ");
        iHours = myScanner.nextInt();

        System.out.println("Enter Pay Rate: ");
        iRate = myScanner.nextDouble();

        cNetPay = iHours * iRate;

        System.out.println("Wage information for "+ iName + ":");
        System.out.println("\tHours: " + iHours );
        System.out.println("\tRate: " + iRate);
        System.out.println("\tNet pay: " + cNetPay);

        System.out.println("Program Complete");
    }





}
