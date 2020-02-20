import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class writeFile {

    static String iString, iFirstname,iLastname;
    static int iHours, iDept;
    static double iRate;
    static Scanner scan;
    static char inputAgain = 'Y';
    static PrintWriter pw;
    static int[]deptNum={1,6,9,8,3,2,7};

    public static void main(String[] args) {
        init();
        while(inputAgain =='Y'){
            input();
            output();
            System.out.println("Enter another employee? (Y,N)");
            inputAgain = scan.nextLine().toUpperCase().charAt(0);
        }
        pw.close();
        System.out.println("Program Complete...");
    }
    public static void init() {
        scan = new Scanner(System.in);
        try{
            pw = new PrintWriter(new File("payroll.dat"));
        }catch (Exception e){
            System.out.println("Output file error...");
        }
    }
    public static void input() {
        System.out.print("Enter First Name: ");
        iFirstname = scan.nextLine();
        while (iFirstname.trim().length() < 1 || iFirstname.trim().length() > 25) {
            System.out.println("First name must be between 1 and 25 characters re-enter");
            System.out.print("Enter First Name: ");
            iFirstname = scan.nextLine();
        }
        System.out.print("Enter Last Name: ");
        iLastname = scan.nextLine();
        while (iLastname.trim().length() < 1 || iLastname.trim().length() > 25) {
            System.out.println("Last name must be between 1 and 25 characters re-enter");
            System.out.print("Enter Last Name: ");
            iLastname = scan.nextLine();
        }
        do {
            try {
                System.out.print("Enter hours: ");
                iString = scan.nextLine();
                iHours = Integer.parseInt(iString);
                if (iHours < 0 || iHours > 999) {
                    System.out.println("Hours must be 1-999");
                }
            }catch (Exception e) {
                System.out.println("Hours must be 1-999");
                iHours = -1;
            }
        } while (iHours < 0 || iHours > 999);
        do {
            try {
                System.out.print("Enter rate: ");
                iString = scan.nextLine();
                iRate = Double.parseDouble(iString);
                if (iRate < 7.25 || iRate > 99.99) {
                    System.out.println("Rate must be 7.25 - 99.99");
                }
            }catch (Exception e) {
                System.out.println("Rate must be 7.25 - 99.99");
                iRate = -1;
            }
        } while (iRate < 7.25 || iRate > 99.99);
        boolean ok=false;
        do {
            try {
                System.out.print("Enter Department: ");
                iString = scan.nextLine();
                iDept = Integer.parseInt(iString);

                for(int i=0;i < deptNum.length;i++) {
                    if (iDept == deptNum[i]) {
                        ok = true;
                        break;
                    }
                }
                    if(!ok){
                        System.out.println("Department invalid, press enter");
                    }

            }catch (Exception e) {
                System.out.println("Department invalid, press enter");
            }
        } while (!ok);

    }
    public static void output() {
        String record;
        record = String.format("%-25s%-25s%01d%03d%05.2f",iFirstname, iLastname,iDept, iHours, iRate);
        pw.println(record);
    }
}
