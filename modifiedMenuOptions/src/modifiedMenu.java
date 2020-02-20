
import java.util.Scanner;
/*
This program displays an option menu
User picks a word, chooses an number of times to print the word
After printing user is presented menu again..
 */
public class modifiedMenu {
    static Scanner scan = new Scanner(System.in);
    static Boolean exit = false;
    public static void main(String[] args) {


        //main user loop
        System.out.println("Welcome to the Yeet and friends program!\n");
        while (!exit) {
            menuOption();
        }
        System.out.print("You have chosen to leave. Press enter to exit.");
        scan.nextLine();
    }

    public static void menuOption() {
        String[] words={"Yeet","Seymore", "Bob", "Steve"};//Word options for menu
        int choice =1;
        String input = "";

        try{
            System.out.println("These are the menu choices.\n");
            for(int i =0;i < words.length;i++) {
                System.out.println(choice+"-\t"+words[i]);
                choice++;
            }
            System.out.println("E-\tExit Program");


        }catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.print("\nEnter an option: ");
        input=scan.nextLine();
        if (!input.toUpperCase().equals("E")) {
            if (input )
                default:
                    System.out.println("\nInvalid option. Press enter for menu.");
                    scan.nextLine();

            }
        }
        else{
            exit = true;
        }
    }

    public static void output(String word) {
        int ctr = 1;
        int num =0;
        Boolean valid = false;
        while(!valid){
            try{
                System.out.print("\nHow many "+ word+"'s do you want to print? ");
                num=Integer.parseInt(scan.nextLine());
                valid = true;
            }catch (Exception e){
                System.out.println("Let's try that again...");
            }
        }


        for(int i=0;i<num;i++){
            System.out.println(word+" "+ctr);
            ctr++;
        }
        System.out.print("\nWasn't that just great! Press enter to return to the menu.");
        scan.nextLine();
    }

}