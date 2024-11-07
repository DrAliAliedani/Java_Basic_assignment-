package sheet1;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the properties of the steel
        System.out.print("Enter Rockwell hardness: ");
        int hardness = in.nextInt();

        System.out.print("Enter Carbon content: ");
        double carbonContent = in.nextDouble();

        System.out.print("Enter Tensile strength (in kg/cm2): ");
        int tensileStrength = in.nextInt();

        // Initialize condition flags
        int conditionCode = 0;

        // Check each condition and set bits accordingly
        if (hardness > 50) {
            conditionCode += 4;
        }
        if (carbonContent > 0.7) {
            conditionCode += 2;
        }
        if (tensileStrength > 5600) {
            conditionCode += 1;
        }

        // Determine grade based on conditionCode
        int grade;
        switch (conditionCode) {
            case 7: // All conditions (i, ii, iii) satisfied
                grade = 10;
                break;
            case 6: // Conditions (i) and (ii) satisfied
                grade = 9;
                break;
            case 3: // Conditions (ii) and (iii) satisfied
                grade = 8;
                break;
            case 5: // Conditions (i) and (iii) satisfied
                grade = 7;
                break;
            default: // None or only one condition satisfied
                grade = 0;
                break;
        }

        // Output the grade
        System.out.println("The grade of the steel is: " + grade);

        in.close();
    }
}