package sheet1;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the price of the book
        System.out.print("Enter the price of the book: $");
        double price = in.nextDouble();

        // Initialize the commission rate
        double commissionRate;

        // Determine commission rate based on the price using if-else
        if (price < 100) {
            commissionRate = 0.12;
        } else {
            commissionRate = 0.18;
        }

        // Calculate commission and net price
        double commission = price * commissionRate;
        double netPrice = price - commission;

        // Display the results
        System.out.printf("Commission: $%.2f%n", commission);
        System.out.printf("Net Price: $%.2f%n", netPrice);

        in.close();
    }
}