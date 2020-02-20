import java.util.Scanner;

/**
 * This program receives input of beach name, quantity and price of snow cones and corn dogs
 * Calculates bill including sales tax then outputs total.
 * Created 12/21/2019 By Nick Houser
 */

public class BeachBumsProgram {
    static Scanner Scanny = new Scanner(System.in); //Instantiates new Scanner

    public static void main(String[] args){
        Beach beach = new Beach(); //Instantiates a new Beach Object
        input(beach);
        beach.calcs();
        output(beach);
    }

    /**
     * assigns values to the Beach object variables using setters
     * @param beach
     */
    private static void input(Beach beach) {
        System.out.println("Enter name of beach:");
        beach.setBeachName(Scanny.nextLine());
        System.out.println("Enter corn dog quantity:");
        beach.setCornDogQty(Integer.parseInt(Scanny.nextLine()));
        System.out.println("Enter corn dog price:");
        beach.setCornDogPrice(Double.parseDouble(Scanny.nextLine()));
        System.out.println("Enter snow cone quantity:");
        beach.setSnowConeQty(Integer.parseInt(Scanny.nextLine()));
        System.out.println("Enter snow cone price:");
        beach.setSnowConePrice(Double.parseDouble(Scanny.nextLine()));
    }

    /**
     * Displays the returned string from receipt method
     * @param beach
     */
    private static void output(Beach beach) {
        System.out.println(beach.receipt());
        System.out.println("Remember-- If you can't beach them, join them!");
    }
}
