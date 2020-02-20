import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * Receives input data determines products types and price totals
 * returns receipt as a string
 */

public class BasketBuild {
    private char iBasketType;
    private String iAccesType;
    private int iCustType;
    private String iState;
    private String oBasketType;
    private String oAccesType;
    private String oCustType;
    private String oState;
    double basketCost;
    double basketTot;
    double accessCost;
    double discountAmt;
    double discountRate;
    double subtotal;
    double taxAmt;
    double taxRate;
    double totalAmt;

    /**
     * Default Constructor
     */
    public BasketBuild(){
        iBasketType = 'U';
        iAccesType = "A4";
        iCustType = 1;
        iState = "IA";

    }
    //Mutators
    public void setiBasketType(char input){iBasketType = input;}
    public void setiAccesType(String input){iAccesType = input;}
    public void setiCustType(int input){iCustType = input;}
    public void setiState(String input){iState = input;}

    //Accessors
    public String getoBasketType() {return oBasketType;}
    public String getoAccesType() {return oAccesType;}
    public String getoCustType() {return oCustType;}
    public String getoState() {return oState;}

    /** Checks against inputs of basket type, accessory type, state and
     *  customer type. Assigns values to output variables
     *  calculates subtotal, tax and total due.
     */
    public void calcs(){
        //Checks against basket type assigns proper values dependent variables
        switch (iBasketType) {
            case 'C':
                oBasketType = "Cracker";
                basketCost = 15;
                break;
            case 'W':
                oBasketType = "Wildflower";
                basketCost = 53.25;
                break;
            case 'K':
                oBasketType = "Key";
                basketCost = 23.15;
                break;
            case 'M':
                oBasketType = "Magazine";
                basketCost = 34.2;
                break;
            default:
                oBasketType = "Umbrella";
                basketCost = 112.77;
        }
        //Checks against accessory type assigns proper values dependent variables
        switch (iAccesType){
            case "A1":
                oAccesType = "Protector";
                accessCost = 4.75;
                break;
            case "A2":
                oAccesType = "Liner";
                accessCost = 8;
                break;
            case "A3":
                oAccesType = "Combo";
                accessCost = 10.55;
                break;
            default:
                oAccesType = "None";
                accessCost = 0;
                break;
        }
        //Checks against state assigns proper values dependent variables
        if(iState.equals("MO")) {
            oState = "Missouri";
            taxRate = .04225;
        }
        else{
            if(iState.equals("IL")){
                oState = "Illinois";
                taxRate = .0625;
            }
            else{
                oState = "Iowa";
                taxRate = .06;
            }
            }
        //Checks against Customer Type assigns proper values to dependent variables
        if(iCustType == 3){
            oCustType = "Bus";
            discountRate = .1;
        }
        else{
            if(iCustType ==2){
                oCustType = "Walk in";
                discountRate = 0;
            }
            else{
                oCustType = "Dealer";
                taxRate = 0;
                discountRate = .5;
            }
        }
        //Finally get to the calculations
        basketTot = basketCost+accessCost;
        discountAmt = basketTot*discountRate;
        subtotal = basketTot - discountAmt;
        taxAmt = subtotal * taxRate;
        totalAmt = subtotal + taxAmt;
    }

    /**
     * Returns a string for the program to display as a receipt
     * @return
     */
    public String receipt() {
        LocalDate oDate = LocalDate.now();
        DecimalFormat df = new DecimalFormat("$##,##0.00");
        String receipt;
        receipt = "Current date:\t\t"+oDate+
                "\nBasket Type -->\t\t"+oBasketType +
                "\nAccessory Type -->\t"+oAccesType +
                "\nCustomer Type -->\t"+oCustType +
                "\nState -->\t\t\t"+oState+
                "\n-------------------------------"+
                "\nBasket Amount\t\t"+df.format(basketTot)+
                "\nDiscount Amount\t\t"+df.format(discountAmt)+
                "\nSubtotal\t\t\t"+df.format(subtotal)+
                "\nTax Amount\t\t\t"+df.format(taxAmt)+
                "\nTotal Due\t\t\t"+df.format(totalAmt);
        return receipt;
    }
}