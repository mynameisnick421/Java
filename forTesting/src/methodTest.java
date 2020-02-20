import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/*
This program displays an option menu
Option 1 prompts for username and password and loops until valid entries
Option 2 not done
Option 3 exits program
 */
public class methodTest {
    static Scanner scan;
    static UserInfo info;
    static PrintWriter pw;
    static char[] programCode={'B','L','N','P','R','S'};
    static String[] program={"Business","Lasers","Networking","Programming","Robotics","Social Media"};
    static String[] status={"Commuter no meal plan","Commuter with meal plan","Dorm"};
    public static void main(String[] args) {
        boolean exit = false;
        init();
        while (!exit) {
            String userId = "Invalid";
            String userPassword = "Invalid";
            int userStatus;
            char userProgram='a';
            switch (menuDisplay()) {
                case "1":
                    while (userId.equals("Invalid")) {//loops username method until a valid username is returned
                        userId = inputUserName();
                    }
                    while (userPassword.equals("Invalid")) {
                        userPassword = inputPassword();
                    }
                    do{
                        userStatus=inputUserStatus();
                    }
                    while(!validStatus(userStatus));
                    do{
                        userProgram = inputUserProgram();
                    }
                    while (!validProgram(userProgram));
                    info = new UserInfo(userId, userPassword,userStatus, userProgram);//Instantiate Userinfo Object
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
                        pw.close();
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
    public static void init(){
        scan = new Scanner(System.in);
        try{
            pw = new PrintWriter(new File("UserEntry.dat"));
        }catch (Exception e){
            System.out.println("Output file error...");
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
        String id;
        do {
            System.out.println("\nLeave blank to view username requirements.");
            System.out.print("Enter a User Name: ");
            id = scan.nextLine();
            if (id.isBlank()) {
                usernameReq();
            }
        }while(id.isBlank());

        if (containSpaces("Username", id)) {//if whitespace do this
            return retVal;
        }
        if (valLength(id, 8, 12)) {//is string length in range
            if (validUsername(id)) {//if username valid return username to main
                retVal = id;
            }
        }
        return retVal;
    }

    public static boolean validUsername(String word){
        if (word.matches(".*[^a-zA-Z0-9].*")) {//checks for special characters
            System.out.print("\nDo not include special characters. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        if (word.matches("[a-zA-Z]{6,10}[0-9]{2}")) {//if username valid return username to main
            System.out.print("\nUsername accepted.\nPress enter to continue.");
            scan.nextLine();
            return true;
        }
        else{
            System.out.print("\nUsername does not meet requirements. Press enter to continue.");
            scan.nextLine();
            return false;
        }
    }
    public static void usernameReq() {
        System.out.println("\nUsername requirements:");
        System.out.println("\tMust be 6-10 letters followed by 2 numbers.");
        System.out.print("\tCan not contain any spaces or special characters.\n");
    }
    public static String inputPassword() {
        String retVal = "Invalid";
        String pWord;
        do{
            System.out.println("\nLeave empty to view password requirements.");
            System.out.print("Enter a Password: ");
            pWord = scan.nextLine();
            if (pWord.isBlank()) {//if id is blank do this
                passwordReq();
            }
        }
        while (pWord.isBlank());
        if (!containSpaces("Password", pWord)) {//if whitespace do this
            if (valLength(pWord, 6, 12)) {
                if (validPassword(pWord)) {
                    retVal = pWord;     //if username valid return username to main
                }
            }
        }
        return retVal;
    }
    public static boolean validPassword(String word){
        if (!word.matches(".*[a-z].*")) {//check for lowercase letter
            System.out.print("\nLowercase character required. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        if (!word.matches(".*[A-Z].*")) {//check for uppercase letter
            System.out.print("\nUppercase character required. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        if (!word.matches(".*[0-9].*")) {//check for number
            System.out.print("\nA digit is required. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        if (word.matches(".*[^a-zA-Z0-9].*")) {//check for special character
            System.out.print("\nNo special characters are allowed. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        else{
            System.out.print("\nPassword accepted.\nPress enter to continue.");
            scan.nextLine();
            return true;
        }
    }
    private static void passwordReq() {
        System.out.println("\nPassword requirements:");
        System.out.println("\tPassword must be 6-12 characters.");
        System.out.println("\tMust contain at least 1 uppercase letter.");
        System.out.println("\tMust contain at least 1 lowercase letter.");
        System.out.println("\tMust contain at least 1 number.");
        System.out.println("\tCan not contain any spaces, tabs or special characters.");
    }
    public static int inputUserStatus(){
        String iString;
        int status=0;
        boolean valid = false;
        while(!valid) {
            do{
                System.out.println("\nLeave blank to view status types");
                System.out.print("Enter status: ");
                iString = scan.nextLine();
                if(iString.isBlank()){
                    statusreq();// display requirements
                }
            }
            while (iString.isBlank());
            try {
                status = Integer.parseInt(iString);
                valid = true;

            } catch (Exception e) {
                System.out.print("Invalid option, Press enter to try again.");
                scan.nextLine();
            }
        }
        return status;
    }
    public static void statusreq(){
        System.out.println("\n1 --> Commuter no meal plan.");
        System.out.println("2 --> Commuter with meal plan.");
        System.out.println("3 -->Dorm");
    }
    public static boolean validStatus(int s){
        if (s==1|s==2|s==3){
            System.out.print("\nStatus accepted.\nPress enter to continue.");
            scan.nextLine();
            return true;
        }
        System.out.print("Invalid option, Press enter to try again.");
        scan.nextLine();
        return false;
    }

    public static char inputUserProgram(){
        boolean ok = false;
        String input;
        char program='3';
        while(!ok){
            do {
                System.out.println("\nLeave blank to display codes.");
                System.out.print("Enter program code: ");
                input = scan.nextLine();
                if (input.isBlank()) {
                    programCodeDisplay();
                }
            }while(input.isBlank());
            if (input.length() == 1){
                program= input.toUpperCase().charAt(0);
                ok = true;
            }
            else{
                System.out.println("Invalid Program code. Press enter..");
                scan.nextLine();
            }
        }
        return program;
    }

    public static boolean validProgram(char code){
        for(int i=0;i < programCode.length;i++) {
            if (code == programCode[i]) {
                System.out.print("\nProgram accepted.\nPress enter to continue.");
                scan.nextLine();
                return true;
            }
        }
        System.out.print("Invalid Program code. Press enter..");
        scan.nextLine();
        return false;
    }

    public static void programCodeDisplay(){
        System.out.println("\nB--> Business");
        System.out.println("L--> Lasers");
        System.out.println("N--> Networking");
        System.out.println("P--> Programming");
        System.out.println("R--> Robotics");
        System.out.println("S--> Social Media");
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
        if( word.length() < minimum ){
            System.out.print("\nA minimum of "+minimum+" characters is required. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        if(word.length() > maximum){
            System.out.print("\nA maximum of "+maximum+" characters is required. Press enter to continue.");
            scan.nextLine();
            return false;
        }
        return true;
    }
    public static void output() {
        System.out.println("\nValid data accepted.");
        String record = String.format("%-12s%-12s%1d%1s",info.getUserId(),info.getUserPassword(),info.getUserStatus(),info.getUserProgram());
        pw.println(record);
        System.out.print("Press enter to return to Menu.");
        scan.nextLine();
    }
}
