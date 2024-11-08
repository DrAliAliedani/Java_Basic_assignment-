package sheet1;

public class Question_11 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 59; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sum += i;
            }
        }
        System.out.println("The sum of even numbers between 0 and 59 is: " + sum);

    }
}