package sheet1;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the limit up to which Fibonacci series should be printed: ");
        int limit = in.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series up to " + limit + ": " + first + ", " + second);

        int next;
        while (true) { //for()====infinity
            next = first + second;
            if (next > limit) {
                break;
            }
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println();
        in.close();
    }
}