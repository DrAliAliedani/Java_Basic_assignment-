package sheet1;

public class Question_8{
    public static void main(String[] args) {
        System.out.println("Numbers below 100 that are divisible by 7:");

        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}