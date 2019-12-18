/**
 * This class is used to create Rental Objects.
 */
public class Rental {
    //instance variables (stored inside the object)
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;
    //class variables
    private static final int RATE = 40;

    //constructor (special method with the same name as the class name
    //this is a reference to the current object

    /**
     * Constructs a Rental object with name, phone, minutes
     * @param n
     * @param p
     * @param m
     */
    public Rental(String n, String p, int m){
        name = n;
        phone = p;
        totMinutes = m;
    }

    /**
     * Calculates total hours, extra minutes and cost
     */
    public void calc(){
        hours = totMinutes / 60;
        extraMinutes = totMinutes % 60;
        cost = hours * RATE + extraMinutes;
    }

    /**
     * Returns a formatted string from Rental data.
     * @return
     */
    public String display(){
        return ("Name: "+ name+
                "\nPhone: "+ phone+
                "\nHours: "+ hours+
                "\nExtra Minutes: "+ extraMinutes+
                "\nCost: "+cost);
    }

}