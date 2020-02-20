import java.util.Scanner;

//SantasHelper Program Created by Nick Houser 12-17-2019
//Takes Childs name, 2 toy names and prices. Figures taxes prints a receipt
public class SantasHelper {
    static Scanner Scanny = new Scanner(System.in); //Instantiates new Scanner

    public static void main(String[] args){
        Toy toy = new Toy(); //Instantiates new Toy Object
        input(toy);
        toy.calculate();
        output(toy);
    }

    public static void input(Toy toy){

        System.out.println("Enter child's first name: ");
        toy.setFName(Scanny.nextLine());

        System.out.println("Enter child's last name: ");
        toy.setLName(Scanny.nextLine());

        System.out.println("Enter first toy name: ");
        toy.setFToyN(Scanny.nextLine());

        System.out.println("Enter price of the first toy: ");
        toy.setFToyP(Double.parseDouble(Scanny.nextLine()));

        System.out.println("Enter second toy name: ");
        toy.setSToyN(Scanny.nextLine());

        System.out.println("Enter price of the second toy: ");
        toy.setSToyP(Double.parseDouble(Scanny.nextLine()));
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
