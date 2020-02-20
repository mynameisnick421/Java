/**
 * Example of the case structure in java called the switch.
 * Can be used with char, integer and Strung types
 * 1/14/20
 */
public class Case {
    public static void main(String[] args){
        String startDate;

        startDate = "Su19";
/*
        switch (startDate){
            case "SU19":
                System.out.println("Your grad year is 2021");
                break;
            case "FA19":
                System.out.println("Your grad year is 2021.");
                break;
            case "FA18":
                System.out.println("Your grad year is 2020");
                break;
            case "SP18":
                System.out.println("Your grad year is 2019");
        }

        switch (startDate){
            case "SU19":
            case "FA19":
                System.out.println("Your grad year is 2021.");
                break;
            case "FA18":
                System.out.println("Your grad year is 2020");
                break;
            case "SP18":
                System.out.println("Your grad year is 2019");
        }


    char grade = 'B';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                break;
            case 'F':
                System.out.println("Small brain");
                break;
            default:
                System.out.println("Invalid");
        }

 */

        switch (startDate.toUpperCase()){
            case "SU19":
            case "FA19":
                System.out.println("Your grad year is 2021.");
                break;
            case "FA18":
                System.out.println("Your grad year is 2020");
                break;
            case "SP18":
                System.out.println("Your grad year is 2019");
        }
    }
}
