import java.util.Scanner;
/*
This program displays an option menu
Option 1 prompts for username and password and loops until valid entries
Option 2 not done
Option 3 exits program
 */
public class passwordTest {
    static Scanner scan = new Scanner(System.in);
    static UserInfo info;
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            String userId = "Invalid";
            String userPassword = "Invalid";
            String menuInput = menuDisplay();
            switch (menuInput) {
                case "1":
                    while (userId.equals("Invalid")) {//loops username method until a valid username is returned
                        userId = inputUserName();
                    }
                    while (userPassword.equals("Invalid")) {
                        userPassword = inputPassword();
                    }
                    info = new UserInfo(userId, userPassword);//Instantiate Userinfo Object
                    output();
                    break;
                case "2":
                    System.out.println("\nOption 2 coming soon...");
                    System.out.println("Press enter to return to Menu.");
                    scan.nextLine();
                    break;
                case "3":
                    System.out.println("Do you want to leave the program? (Y/N)");
                    String confirm = scan.nextLine();
                    if (confirm.toUpperCase().equals("Y")) {
                        System.out.println("Ok, Bye.");
                        exit = true;
                    } else {
                        if (confirm.toUpperCase().equals("N")) {
                            System.out.println("Press enter to return to Menu");
                        } else {
                            System.out.print("Invalid Entry. Press enter to return to Menu.");
                        }
                        scan.nextLine();
                    }
                    break;
                default:
                    System.out.println("Invalid entry press enter to return to Menu.");
                    scan.nextLine();
            }
        }
    }
    public static String menuDisplay() {
        System.out.println("\nUser Id and Password entry");
        System.out.println("\tOption 1\tCreate new user.\n" +
                "\tOption 2\tNot Available.\n" +
                "\tOption 3\tExit Program.\n");
        System.out.print("Enter an option to continue: ");
        return scan.nextLine();
    }
    public static String inputUserName() {
        String retVal = "Invalid";
        System.out.println("\nEnter R to view username requirements.");
        System.out.print("Enter a User Name: ");
        String id = scan.nextLine();
        if (id.toUpperCase().equals("R")) { //displays requirements if requested
            usernameReq();
            return retVal;
        }
        if (id.isBlank()) {//if id is blank do this
            System.out.println("\nUsername is required. Press enter to continue.");
            scan.nextLine();
            return retVal;
        }
        if (containSpaces("Username", id)) {//if whitespace do this
            return retVal;
        }

        if (validEntryU(id)) {//if username valid return username to main
            retVal = id;

        }
        return retVal;
    }
    public static void usernameReq() {
        System.out.println("\nUsername requirements:");
        System.out.println("\tMust be 6-10 letters followed by 2 numbers.");
        System.out.println("\tCan not contain any spaces or special characters.\n");
        System.out.print("Press enter to continue.");
        scan.nextLine();
    }
    public static String inputPassword() {
        String retVal = "Invalid";
        System.out.println("\nEnter R to view password requirements.");
        System.out.print("Enter a Password: ");
        String pWord = scan.nextLine();
        if (pWord.toUpperCase().equals("R")) { //displays requirements if requested
            passwordReq();
            return retVal;
        }
        if (pWord.isBlank()) {//if id is blank do this
            System.out.println("\nPassword is required. Press enter to continue.");
            scan.nextLine();
            return retVal;
        }
        if (containSpaces("Password", pWord)) {//if whitespace do this
            return retVal;
        }

        if (validEntryP(pWord)) {
                retVal = pWord;     //if username valid return username to main
        }

        return retVal;
    }
    private static void passwordReq() {
        System.out.println("\nPassword requirements:");
        System.out.println("\tPassword must be 6-12 characters.");
        System.out.println("\tMust contain at least 1 uppercase letter.");
        System.out.println("\tMust contain at least 1 lowercase letter.");
        System.out.println("\tMust contain at least 1 number.");
        System.out.println("\tCan not contain any spaces, tabs or special characters.\n");
        System.out.print("Press enter to continue.");
        scan.nextLine();
    }
    public static void output() {
        System.out.println("\nValid UserID and Password accepted.");
        System.out.print("UsedID: ");
        System.out.println(info.getUserId());
        System.out.print("Password: ");
        System.out.println(info.getUserPassword());
        System.out.print("Press enter to return to Menu.");
        scan.nextLine();
    }
    /**
     * Displays error message if whitespace is detected
     * @param name Used for error message
     * @param word String to check
     * @return True if whitespace is detected
     */
    public static Boolean containSpaces(String name, String word) {
        if (!word.equals(word.replaceAll("\\s", ""))) {//if whitespace do this
            System.out.println("\n" + name + " can not contain spaces or tabs. Press enter to continue.");
            scan.nextLine();
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Tests if string length is between supplied range
     * @param word String to test
     * @param minimum Minimum string length
     * @param maximum Maximum string length
     * @return True if String is between values
     */
    public static boolean valLength(String word, int minimum, int maximum) {
        return word.length() <= maximum && word.length() >= minimum;
    }
    /**
     * Validates username and password.
     * @param word String to validate
     * @return true if string is valid
     */
    public static boolean validEntryP(String word) {
        if (valLength(word, 6, 12)) {
            if (!word.matches(".*[a-z].*")) {//check for lowercase letter
                return false;
            }
            if (!word.matches(".*[A-Z].*")) {//check for uppercase letter
                return false;
            }
            if (!word.matches(".*[0-9].*")) {//check for number
                return false;
            }
            if (word.matches(".*[^a-zA-Z0-9].*")) {//check for special character
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static boolean validEntryU(String word) {
        if (valLength(word, 8, 12)) {
            if (word.matches(".*[^a-zA-Z0-9].*")) {//checks for special characters
                return false;
            }
            if (word.matches("[a-zA-Z]{6,10}[0-9]{2}")) {//if username valid return username to main
                return true;
            }
        }
        return false;
        }
    }
