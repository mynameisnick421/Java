import java.util.Scanner;

public class SammyNoObjects {
    //global variables
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args){
        //local variables
        String iName, iPhone;
        int iMin, cHours, cMin;
        Double cost;

        //get name
        iName = inputName();        //call and return name
        //get phone number
        iPhone = inputPhone();      //call and return phone number
        //get Minutes
        iMin = inputMin();          //call and return minutes
        //get hours
        cHours = calcHours(iMin);   //pass minutes receive hours
        //get extra minutes
        cMin = calcExtraMin(iMin);  //pass minutes receive extra minutes
        //get cost
        cost = calcCost(cHours, cMin);      //pass minutes receive costs
        //Display
        output(cHours, cMin, cost);
    }

    public static String inputName(){
        String name;
        System.out.println("Enter Name: ");
        name = scannyMcScanner.nextLine();
        return name;
    }

    public static String inputPhone(){
        String phone;
        System.out.println("Enter Phone Number: ");
        phone = scannyMcScanner.nextLine();
        return phone;
    }

    public static int inputMin(){
        String min;
        int cMin;
        System.out.println("Enter Number of Minutes: ");
        min = scannyMcScanner.nextLine();
        cMin = Integer.parseInt(min);
        return cMin;
    }

    public static int calcHours(int minutes){
        return minutes / 60;
    }

    public static int calcExtraMin(int minutes){
        return minutes % 60;
    }

    public static double calcCost(int hours, int minutes){
        return (hours * 40) + minutes;
    }

    public static void output(int hours, int eMin, double cost){
        System.out.println("The cost for "+hours+" hours and "+eMin+" minutes is $"+cost+".");
    }
}
