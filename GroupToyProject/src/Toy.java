public class Toy
{
    public static String greeting;
    final static double taxRate = 0.07;
    private String fName;
    private String lName;
    private String fToyN;
    private double fToyP;
    private String sToyN;
    private double sToyP;
    private double subtotal;
    private double taxAmt = 0;
    private double totalBill = 0;

    public String getFName(){return fName;}
    public String getLName(){return lName;}
    public String getFToyN(){return fToyN;}
    public double getFToyP(){return fToyP;}
    public String getSToyN(){return sToyN;}
    public double getSToyP(){return sToyP;}

    public void setFName(String f) {fName = f; }
    public void setLName(String l) {lName = l; }
    public void setFToyN(String tN1) {fToyN = tN1; }
    public void setFToyP(double tP1) {fToyP = tP1;}
    public void setSToyN(String tN2) {sToyN = tN2;}
    public void setSToyP(double tN2) {sToyP = tN2;}

    public void Toy()
    {
        fName = "Elf";
        lName = "Onashelf";
        fToyN = "Monopoly";
        fToyP = 15.75;
        sToyN = "Legos";
        sToyP = 12.00;
    }

    public void calculate()
    {
        subtotal = fToyP + sToyP;
        taxAmt = subtotal * taxRate;
        totalBill = subtotal + taxAmt;
    }

    public String receipt()
    {
        String oPt;
        oPt =   lName + ", " + fName +
                "\nItem\t\tPrice\n" +
                fToyN + ":\t\t" + fToyP +
                "\n" + sToyN + ":\t\t" + sToyP +
                "\nSubtotal:\t" + subtotal +
                "\nTax:\t\t" + taxAmt +
                "\nTotal:\t\t" + totalBill+
                "\n"+greeting;
        return oPt;
    }


}
