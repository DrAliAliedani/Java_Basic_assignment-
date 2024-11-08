package sheet1;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read student name
        System.out.print("Enter student's name: ");
        String name = in.next();

        // Read four marks
        double marks;
        double sum = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks = in.nextDouble();
            sum += marks;
        }

        // Calculate final grade (average)
        double finalGrade = sum / 4;

        // Determine passing or failing
        String status;
        if(finalGrade >= 50)  
        		status="Passing";
        else
        	status="Failing";

        // Display results
        System.out.println("\nStudent Name: " + name);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Status: " + status);

        in.close();
    }
}