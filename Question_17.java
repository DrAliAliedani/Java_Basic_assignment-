package sheet1;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        // Read the range from the user
        System.out.print("Enter the starting number: ");
        int start = in.nextInt();
        System.out.print("Enter the ending number: ");
        int end = in.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through each number in the range
        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue; // Skip numbers less than or equal to 1 as they are not prime
            }

            boolean isPrime = true;

            // Check if the current number is prime
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print the number if it is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

       
       in.close();
    }
}