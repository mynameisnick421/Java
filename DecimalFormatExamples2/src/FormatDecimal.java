import javax.swing.*;
import java.text.*;
public class FormatDecimal
{
    public static void main(String[] args)
    {
        String pattern = "$###,###.##";
        String gpaPattern = "0.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        DecimalFormat gpaFormat = new DecimalFormat(gpaPattern);
        String iData;
        Double iGpa;
        String oGPA;
        Double iSalary;
        String oSalary;

        //get salary from user
        iData = JOptionPane.showInputDialog(null, "Enter your desired salary: ",
                "Salary Entry", 1);


        //convert to double
        iSalary = Double.parseDouble(iData);

        iData = JOptionPane.showInputDialog(null, "Enter your GPA: ",
                "GPA Entry", 1);

        iGpa = Double.parseDouble(iData);


        //format and display
        oSalary = moneyFormat.format(iSalary);
        oGPA = gpaFormat.format(iGpa);
        System.out.println(("Your salary is "+ oSalary));
        System.out.println("Your GPA is "+ oGPA);

        System.out.printf("%-11s%10s%-4s\n", "Salary", " ", "GPA");
        System.out.printf("%-11s%10s%4s", oSalary, " ", oGPA);

    }
}
