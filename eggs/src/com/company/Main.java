package com.company;

import java.util.Scanner;

public class Main {
    static int iNumEggs;
    static int cDozen=0, cLoose=0; //Variables to store numbers of dozens and loose eggs
    static double DozenPrice = 3.25;
    static double LoosePrice = .45;
    static double cDozenTotalCost, cLooseTotalCost, cTotalCost; //Variables to store total costs
    static Scanner  myScanner;

    public static void main(String[] args) {
	// write your code here
        myScanner = new Scanner(System.in);

        System.out.println("Enter Number of eggs purchased: ");
        iNumEggs = myScanner.nextInt();


        cDozen = iNumEggs / 12;
        cDozenTotalCost = cDozen * DozenPrice;
        cLoose = iNumEggs % 12;
        cLooseTotalCost = cLoose * LoosePrice;
        cTotalCost = cDozenTotalCost + cLooseTotalCost;

        System.out.print("You ordered "+iNumEggs+" eggs.\nThat's ");

        if(cDozen >0 & cLoose >0){
            System.out.println(cDozen+ " dozen at $"+cDozenTotalCost+" and "+cLoose+" loose eggs at $"+cLooseTotalCost+".");
        }else if (cDozen>0){
            System.out.println(cDozen+ " dozen at $"+cDozenTotalCost);
        }else{
            System.out.println(cLoose+" loose eggs at $"+cLooseTotalCost+".");
        }

        System.out.println("For a total of $"+cTotalCost);
    }
}
