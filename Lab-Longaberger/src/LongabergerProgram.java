import java.util.Scanner;

/**
 * This program asks for order type basket specs., customer type, and customer information.
 * It will calculate total cost including sales tax.
 * It will output to the console.
 */

public class LongabergerProgram {
    static Scanner scan = new Scanner(System.in); //Instantiates new Scanner
    static BasketBuild basket;
    public static void main(String[] args){
        basket = new BasketBuild();
        input();
        basket.calcs();
        System.out.println(basket.receipt()); //Displays String returned from basket object receipt method
        }
    public static void input(){
        System.out.println("Enter Order Type 'C' for Custom, 'S' for Standard: ");
        if(scan.nextLine().toUpperCase().equals("C")){ //If "C" or "c" was entered prompt for more information
            System.out.println("Enter first letter of desired basket type: ");
            basket.setiBasketType(scan.nextLine().toUpperCase().charAt(0));
            System.out.println("Enter accessory type code ex.'A2': ");
            basket.setiAccesType(scan.nextLine().toUpperCase());
            System.out.println("Enter customer type code ex.'2' for a walk-in: ");
            basket.setiCustType(Integer.parseInt(scan.nextLine()));
            System.out.println("Enter state abbreviation: ");
            basket.setiState(scan.nextLine().toUpperCase());
        }
    }
}
