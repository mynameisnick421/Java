import java.util.Scanner;

/**
 * This class prompts for name, phone, and rental minutes.
 * Calculates hours, extra minutes, then displays it.
 */
public class SammysProgram {
    //global variables
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args){
        //get name
        String iName = inputName();        //call and return name
        //get phone number
        String iPhone = inputPhone();      //call and return phone number
        //get Minutes
        int iMin = inputMin();          //call and return minutes

        //Construct a Rental object with the input data (instantiation)
        Rental myRental = new Rental(iName, iPhone, iMin);

        //call the calc
        myRental.calc();
        //call the display, prints to console
        System.out.println(myRental.display());

        iName = inputName();
        iPhone = inputPhone();
        iMin = inputMin();

        myRental = new Rental(iName, iPhone, iMin);
        myRental.calc();
        System.out.println(myRental.display());


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
}
