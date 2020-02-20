import java.util.Scanner;

public class loopsAndThings {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int num;
        String input = "Y";
        //main user loop
        while(input.toUpperCase().equals("Y")) {
            num = enterNum();
            output(num);
            System.out.println("Enter another number? (Y or N)");
            input = scan.nextLine();
        }
    }

    public static void output(int num) {
        int ctr = 1;
        while(num > 0){

            System.out.print("Yeet");
            System.out.println(" "+ctr);
            num--;
            ctr++;
        }
    }

    public static int enterNum(){
        int iNum = 0;
        boolean valid = false;
        //prompt for value until valid
        while(!valid) {
            try {
                System.out.print("Enter desired amount of Yeet's: ");
                iNum = Integer.parseInt(scan.nextLine());
                if (iNum >= 5 && iNum <= 10) {
                    System.out.println("Number entered ok...Press enter.");
                    valid = true;
                }
                else{
                    System.out.println("Number must be between 5-10. Press enter.");
                }
            } catch (Exception e) {
                System.out.println("Number of Yeet's must be a whole number! Press enter.");
            }
            scan.nextLine();
        }
        return iNum;
    }
}
