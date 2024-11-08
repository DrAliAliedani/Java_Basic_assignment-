package sheet1;

public class Qustion_10 {
    public static void main(String[] args) {
        int number = 20;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}