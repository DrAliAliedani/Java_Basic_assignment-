package sheet1;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number to check if it is a Harshad number: ");
        int number = in.nextInt();

        int sumOfDigits = 0;
        int temp = number;

        // Calculate the sum of the digits
        while (temp != 0) {
            int digit = temp % 10;      // Extract the last digit
            sumOfDigits += digit;       // Add the digit to the sum
            temp /= 10;                 // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        in.close();
    }
}