package sheet2;

import java.util.Scanner;

public class Power{
    public static int power(int base, int exponent) {
    
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = in.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = in.nextInt();

        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        in.close(); // Close the scanner
    }
}