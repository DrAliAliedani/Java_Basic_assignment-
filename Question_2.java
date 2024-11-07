package sheet1;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the employee's pay
        System.out.print("Enter the employee's pay: ");
        double pay = in.nextDouble();
        double bonus;

        // Calculate bonus based on the rules
        if (pay > 3000) {
            bonus = 300; // Fixed bonus for pay above $3,000
        } else if (pay > 1600) {
            bonus = pay * 0.10; // 10% bonus
            if (bonus > 240) { // Cap bonus at $240 for this range
                bonus = 240;
            }
        } else {
            bonus = pay * 0.15; // 15% bonus
            if (bonus < 100) { // Minimum bonus of $100 for this range
                bonus = 100;
            }
        }

        // Display the calculated bonus
        System.out.printf("The bonus for the employee is: $%.2f", bonus);
    }
}
