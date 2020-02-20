import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class readFile {
    static String iString, iFirstName, iLastName, oPay;
    static int iHours, cEmpCtr=0;
    static double iRate, cPay, cEmpPayTot=0;
    static Scanner payrollScan;
    static PrintWriter pw;
    static boolean eof = false;

    public static void main(String[] args) {
        init();
        while(!eof){
            calcs();
            output();
            input();
        }
        totals();
        payrollScan.close();
        pw.close();
        System.out.println("Program ending...");
    }
    public static void init() {
        File payrollFile = new File("payroll.dat");
        try{
            payrollScan = new Scanner(payrollFile);
        }catch (FileNotFoundException e1){
            System.out.println("Input File Error...");
            System.exit(1);//ends program
        }
        try{
            pw= new PrintWriter(new File("payroll.prt"));
        }catch (FileNotFoundException e){
            System.out.println("Output File Error...");
            System.exit(1);//ends program
        }
        pw.format("%-25s%5s%-25s%5s%5s%5s%5s%5s%10s%n%n","First Name"," ", "Last Name"," ","Hours", " ", "Rate"," ", "Pay Amount");
        input();//priming read
    }
    public static void input() {
        String record;
        if(payrollScan.hasNext()){
            record=payrollScan.nextLine();
            iFirstName = record.substring(0,25);
            iLastName = record.substring(25,50);
            iString=record.substring(50,53);
            iHours=Integer.parseInt(iString);
            iString=record.substring(53,58);
            iRate = Double.parseDouble(iString);
        }
        else{
            eof=true;
        }
    }
    public static void calcs() {
        cPay= iHours*iRate;
        cEmpCtr++;
        cEmpPayTot +=cPay;
    }
    public static void output() {
        pw.format("%-25s%5s%-25s%5s%5d%5s%5.2f%5s%10.2f%n%n",iFirstName," ", iLastName," ",iHours," ",iRate," ",cPay);
    }

    public static void totals() {
        DecimalFormat dfEmpCtr = new DecimalFormat("#,##0");
        DecimalFormat dfEmpPayTot = new DecimalFormat("$##,###.00");
        String oEmpCtr= dfEmpCtr.format(cEmpCtr);
        String oEmpPayTot = dfEmpPayTot.format(cEmpPayTot);
        pw.format("%n%21s%5s%54s%10s%n","Number of Employees: ", oEmpCtr, " ",oEmpPayTot);
    }
}
