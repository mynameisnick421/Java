import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args){
        Scanner scanny = new Scanner(System.in);
        int minutes, texts, data;

        System.out.println("How many minutes do you use in a month?");
        minutes = scanny.nextInt();
        System.out.println("how many texts do you send? in a month");
        texts = scanny.nextInt();
        System.out.println("How many gigs of data do you use per month?");
        data = scanny.nextInt();

        if(minutes < 500 && texts == 0 && data == 0){
            System.out.println("You should buy plan A, because it only costs like 49 bucks a month");
        }
        if(minutes < 500 && texts > 0 && data == 0) {
            System.out.println("you should buy plan b it costs 55 dollars a month");
        }
        if(minutes >= 500 && data == 0){
            if(texts < 100){
                System.out.println("You should get plan C, it costs $61 a month.");
            }
            else {
                System.out.println("you should get plan d, it costs $70 a month.");
            }
        }
        if(data > 0 && data < 3){
            System.out.println("Buy plan E or you're stupid, it costs $79 a month");
        }
        if( data >= 3){
            System.out.println("You should get plan F, it costs $87 a month.");
        }
    }
}
