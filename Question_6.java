package sheet1;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of hours worked in the week: ");
        int hoursWorked = in.nextInt();
        double salary = 0;

        if (hoursWorked > 80) {
            System.out.println("Error: No worker is allowed to work more than 80 hours in a week.");
            return;
        }

        
        if (hoursWorked <= 35) {
            salary = hoursWorked * 15; // $15 per hour for the first 35 hours
        } else if (hoursWorked <= 60) {
            salary = (35 * 15) + ((hoursWorked - 35) * 18); // $18 per hour for the next 25 hours
        } else {
            salary = (35 * 15) + (25 * 18) + ((hoursWorked - 60) * 26); // $26 per hour for hours beyond 60
        }

        // Display the calculated salary
        System.out.printf("The total salary for the worker is: $%.2f", salary);
    }
}
