package sheet1;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements (N): ");
        int N = in.nextInt();

        int sumNegative = 0;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            int number = in.nextInt();

            if (number < 0) {
                sumNegative += number;
                countNegative++;
            } else if (number > 0) {
                sumPositive += number;
                countPositive++;
            }
        }

        System.out.println("Summation of negative numbers: " + sumNegative);
        System.out.println("Summation of positive numbers: " + sumPositive);
        System.out.println("Count of negative numbers: " + countNegative);
        System.out.println("Count of positive numbers: " + countPositive);

       in.close();
    }
}