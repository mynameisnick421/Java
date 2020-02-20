import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class TestEmployee {
    public static void main(String[] args){

        String name, phone, birthYear, birthMonth, birthDay;
        LocalDate bDate;

        //input

        name = JOptionPane.showInputDialog(null, "Enter your name:");
        //empOne.setEmpName(name);

        phone = JOptionPane.showInputDialog(null, "Enter you phone number:");
        //empOne.setEmpPhone(phone);

        birthYear = JOptionPane.showInputDialog(null, "Enter birth year:");
        birthMonth = JOptionPane.showInputDialog(null, "Enter birth month:");
        birthDay = JOptionPane.showInputDialog(null, "Enter birth day:");

        bDate = LocalDate.of(Integer.parseInt(birthYear), Integer.parseInt(birthMonth), Integer.parseInt(birthDay));
        //empOne.setEmpBirthDate(bDate);
        Employee empOne = new Employee(name,phone,bDate);
        //Calculate Age

        LocalDate today = LocalDate.now();
        Period span = Period.between(empOne.getEmpBirthDate(), today);//get the birthday calc the difference
        int age = span.getYears();

        //output
        System.out.println("Today is "+ today.getDayOfWeek());
        System.out.println("Name: "+ empOne.getEmpName() +
                "\nPhone: "+empOne.getEmpPhone()+
                "\nBirthDate: "+empOne.getEmpBirthDate()+
                "\nAge: "+ age);
    }
}
