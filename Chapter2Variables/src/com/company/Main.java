package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final double RATE = .75; //Constant

        byte byteMin = -128;//minimum number
        byte byteMax = 127;//maximum number
        short shortMin = -32768;//Minimum number
        short shortMax = 32767; //maximum number
        int intMin = -2147483648; //minimum number
        int intMax = 2147483647; //Maximum number
        float totAmount = 23.7f; //float needs f
        double totamount = 23.7;
        int num = 5;
        double num2;
        double b = 4;
        totamount = num;
        num = (int)totamount; //Explicit casting
        totamount = num; //Implicit casting
        int a = 25;

        num2 = a + 3 / b - 12 *(9-6);
        System.out.println(num2);
    }
}
