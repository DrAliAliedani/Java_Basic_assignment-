package sheet1;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number to find the sum of its digits: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit   number=234%10=4
            sum += digit;             // Add the digit to the sum
            number /= 10;             // Remove the last digit from the number
        }

        // Display the sum of the digits
        System.out.println("The sum of the digits is: " + sum);

        in.close();
    }
}