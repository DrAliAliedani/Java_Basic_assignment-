package sheet2;

import java.util.Scanner;

public class SumD {
    public static int sumOfDigits(int n) {

        if (n < 0) {
            n = -n;
        }

        if (n < 10) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        int result = sumOfDigits(number);

        // Display the result
        System.out.println("The sum of the digits is: " + result);

        in.close(); 
    }
}
