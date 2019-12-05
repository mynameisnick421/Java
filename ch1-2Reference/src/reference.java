/**
 *DisplayClassExample.java
 *
 *This program will demonstrate how to ask the user for information, use methods
 *and display information.
 */

import java.util.*;
import java.text.*;

public class DisplayClassExample {
    // Global Definitions
    static String iName;
    static String iPhone;
    static String iString;
    static int iAge;
    static Scanner scanner;

    public static void main(String[] args) {
        init();
        input();
        output();
    }  // End of main

    public static void input(){
        System.out.print("Please enter your name: ");
        iName = scanner.next(); 				System.out.print("Please enter your phone number: ");
        iPhone = scanner.next();
        System.out.print("Please enter your age: ");
        iString = scanner.next();
        iAge = Integer.parseInt(iString);
    } // end of input

    public static void init(){
        scanner = new Scanner(System.in);
    }

    public static void output(){
        System.out.println("%-15s%3s%12s%3s%3d"+ iName+ " "+ iPhone+ " "+ iAge);
    }


} //end of class