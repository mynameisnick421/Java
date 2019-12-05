public class passandreturn {
    public static void main(String[] args) {
        // write your code here
        double sum, n1 = 3.5, n2 = 2.6;
        int int1 = 5, int2 = 7;

        sum = calcSum(int1, n2);
        printOut(sum);
        sum = calcSum(int1, n1, n2);
        printOut(sum);

    }

    /**
     * Calcuate and return the sum of 2 values
     * @param num1
     * @param num2
     * @return
     */
    public static double calcSum(double num1, double num2) {
        return num1 + num2;
    }

    public static double calcSum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    public static void printOut(double s){
        System.out.println("The sum is: "+s);
    }
}
