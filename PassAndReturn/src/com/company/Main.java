package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double sum, n1 = 3.5, n2 = 2.6;
        int int1 = 5, int2 = 7;
        double val = calcMath(4.9, 8.8, 'A');

        printOut(val);
    }



    /**
     * Calcuate and return the sum of 2 values
     * @param num1
     * @param num2
     * @return
     */
    public static double calcSum(double num1, double num2) {
        double val = num1 + num2;
        if(val >0){
            return val;
        }else{
            return 0;
        }

    }

    public static void printOut(double s){
        System.out.println("The value is: "+s);
    }

    public static double calcMath(double num1, double num2, char op){
        if (op == 'A'){
            return num1 + num2;
        } else if(op=='S'){
            return num1 - num2;
        }else if(op=='M'){
            return num1 * num2;
        }else
            return num1/num2;
    }
}
