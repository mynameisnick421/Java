/**
 * This class is used to create Rental Objects.
 */
public class RentalRevised {
    //instance variables (stored inside the object)
    //private date public methods
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;

    //class variables
    private static final int RATE = 40;

    //accessors (getters)
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public int getTotMinutes (){
        return totMinutes;
    }

    //mutator (setters)
    public void setName(String n){
        this.name = n;
    }
    public void setPhone(String p){
        this.phone = p;
    }
    public void setTotMinutes(int m){
        this.totMinutes = m;
    }
    //constructor (special method with the same name as the class name
    //this is a reference to the current object
    /**
     * Constructs a Rental object with name, phone, minutes
     * @param n
     * @param p
     * @param m
     */
    public RentalRevised(String n, String p, int m){
        name = n;
        phone = p;
        totMinutes = m;
    }

    /**
     * Default constructor
     */
    public RentalRevised(){
        name = "Mickey Mouse";
        phone = "1-800-DISNEY";
        totMinutes = 60;
    }

    /**
     * Calculates total hours, extra minutes and cost
     */
    //instance method  receives an address of an object into the this pointer- no static
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