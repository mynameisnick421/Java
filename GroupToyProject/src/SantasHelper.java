import java.util.Scanner;

//SantasHelper Program Created by Nick Houser 12-17-2019
//Takes Childs name, 2 toy names and prices. Figures taxes prints a receipt
public class SantasHelper {
    static Scanner Scanny = new Scanner(System.in); //Instantiates new Scanner
    //Global Variables



    public static void main(String[] args){
        Toy toy = new Toy(); //Instantiates new Toy Object

        input(toy);
        toy.calculate();
        output(toy);


    }

    public static void input(Toy toy){
        String chFName, chLName, fToyName, sToyName;
        double fToyPrice, sToyPrice;
        System.out.println("Enter child's first name: ");
        chFName = Scanny.nextLine();
        System.out.println("Enter child's last name: ");
        chLName = Scanny.nextLine();
        System.out.println("Enter first toy name: ");
        fToyName = Scanny.nextLine();
        System.out.println("Enter price of the first toy: ");
        fToyPrice = Double.parseDouble(Scanny.nextLine());
        System.out.println("Enter second toy name: ");
        sToyName = Scanny.nextLine();
        System.out.println("Enter price of the second toy: ");
        sToyPrice = Double.parseDouble(Scanny.nextLine());

        toy.setFName(chFName);
        toy.setLName(chLName);
        toy.setFToyN(fToyName);
        toy.setSToyN(sToyName);
        toy.setFToyP(fToyPrice);
        toy.setSToyP(sToyPrice);
    }

    /**
     * Prints to console
     * @param toy
     */
    public static void output(Toy toy){
        String msg ="Have a Holly Jolly Christmas";
        Toy.greeting = msg;
        System.out.println(toy.receipt());
    }

}
