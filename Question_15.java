package sheet1;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number to reverse: ");
        int number = in.nextInt();
        int reversed = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;     // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10;                // Remove the last digit from the number
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversed);

        in.close();
    }
}