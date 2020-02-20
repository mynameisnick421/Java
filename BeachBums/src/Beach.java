import java.text.DecimalFormat;

public class Beach {
    final static double TAX_RATE = .055;
    private String beachName;
    private int snowConeQty;
    private int cornDogQty;
    private double snowConePrice;
    private double cornDogPrice;
    private double subTotal;
    private double salesTaxAmt;
    private double totalBill;

    /**
     * This is the constructor
     */
    public Beach(){
        beachName = "Bum Beach";
        snowConeQty = 21;
        snowConePrice = 1.23;
        cornDogQty = 23;
        cornDogPrice = 3.21;
    }
    //accessors
    public String getBeachName(){return beachName;}
    public int getSnowConeQty(){return snowConeQty;}
    public int getCornDogQty(){return cornDogQty;}
    public double getSnowConePrice(){return snowConePrice;}
    public double getCornDogPrice(){return cornDogPrice;}

    //mutators
    public void setBeachName(String bn){beachName = bn;}
    public void setSnowConeQty(int scq){snowConeQty = scq;}
    public void setCornDogQty(int cdq){cornDogQty = cdq;}
    public void setSnowConePrice(double scp){snowConePrice = scp;}
    public void setCornDogPrice(double cdp){cornDogPrice = cdp;}

    /**
     * calculates sales tax, subtotal and total amounts
     */
    public void calcs(){
        subTotal = (snowConePrice * snowConeQty) + (cornDogPrice * cornDogQty);
        salesTaxAmt = subTotal * TAX_RATE;
        totalBill = subTotal + salesTaxAmt;
    }

    /**
     * Returns formatted receipt with item price and quantity
     * Includes subtotal, sales tax and total due
     * @return
     */
    public String receipt(){
        String output;
        DecimalFormat df = new DecimalFormat("$0.00");
        output =    "Your receipt:"+
                    "\nItem Description\tQuantity\tItem Price"+
                    "\n\t\tCorn Dog\t\t"+cornDogQty+"\t\t"+df.format(cornDogPrice)+
                    "\n\t\tSnow Cone\t\t"+snowConeQty+"\t\t"+df.format(snowConePrice)+
                    "\n__________________________________________"+
                    "\n\t\t\t\tSubTotal:\t\t"+ df.format(subTotal)+
                    "\n\t\t\t\tSales Tax:\t\t"+df.format(salesTaxAmt)+
                    "\n\t\t\t\tTotal Due\t\t"+df.format(totalBill)+
                    "\nThanks for visiting " + beachName+ " beach!";
        return output;
    }

}
