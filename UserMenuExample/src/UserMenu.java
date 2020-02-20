import java.util.Scanner;
/*
This program displays an option menu
User picks a word, chooses an number of times to print the word
After printing user is presented menu again..
 */
public class UserMenu {
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
        System.out.print("OK,bye.");
    }

    public static void menuOption() {
        String input = "";
        System.out.println("These are the menu choices.\n" +
                            "1-\tPrint Yeet\n"+
                            "2-\tPrint Seymore\n"+
                            "3-\tPrint Bob\n"+
                            "E-\tExit Program");
        System.out.print("\nEnter an option: ");
        input=scan.nextLine();
        if (!input.toUpperCase().equals("E")) {
            switch (input) {
                case "1":
                    output("Yeet");
                    break;
                case "2":
                    output("Seymore");
                    break;
                case "3":
                    output("Bob");
                    break;
                default:
                    System.out.println("\nInvalid option. Press enter for menu.");
                    scan.nextLine();
                    break;
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
