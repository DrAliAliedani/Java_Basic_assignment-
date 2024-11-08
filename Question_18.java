package sheet1;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number to check if it is a strong number: ");
        int number = in.nextInt();

        int sum = 0;
        int temp = number;

        // Loop to calculate the sum of the factorials of each digit
        while (temp != 0) {
            int digit = temp % 10;       // Extract the last digit
            int factorial = 1;

            // Calculate the factorial of the digit
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;            // Add the factorial of the digit to the sum
            temp /= 10;                  // Remove the last digit
        }


        if (sum == number) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

       in.close();
    }
}