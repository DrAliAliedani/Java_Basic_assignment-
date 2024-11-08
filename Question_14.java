package sheet1;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = in.nextInt();

        int totalMarks = 0;
        int count = 0;

        // Use while loop to read marks for each subject
        while (count < numSubjects) {
            System.out.print("Enter marks for subject " + (count + 1) + ": ");
            int marks = in.nextInt();
            totalMarks += marks;
            count++;
        }

        // Calculate percentage
        double percentage = (double) totalMarks / numSubjects;

        // Determine grade using switch
        char grade;
        switch ((int) percentage / 10) { //  int 93/10=9  98/10=9  94/10=9  92/10=9====9
            case 10:
            	
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        }
}