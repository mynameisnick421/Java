import java.util.Scanner;

/**
 * This class prompts for name, phone, and rental minutes.
 * Calculates hours, extra minutes, then displays it.
 */
public class SammysProgramRevised {
    //global variables
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args){
        RentalRevised myRental = new RentalRevised(); //new RentalRevised
        //RentalRevised = myRental; create reference
        input(myRental);
        myRental.calc();
        System.out.println(myRental.display());

    }

    private static void input(RentalRevised myRental){

        String name, phone, iMin;
        int cMin;
        System.out.println("Enter Name: ");
        name = scannyMcScanner.nextLine();
        myRental.setName(name);

        System.out.println("Enter Phone Number: ");
        phone = scannyMcScanner.nextLine();
        myRental.setPhone(phone);

        System.out.println("Enter Number of Minutes: ");
        iMin = scannyMcScanner.nextLine();
        cMin = Integer.parseInt(iMin);
        myRental.setTotMinutes(cMin);
    }
}
