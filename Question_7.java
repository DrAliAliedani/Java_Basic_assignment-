package sheet1;

public class Question_7 {
    public static void main(String[] args) {
        double basicPay = 4000.0;  // Example basic pay, you can modify it

        // Calculate Cost of Living (CL)
        double cl = basicPay * 1.2375;  // 123.75% of Basic Pay
        if (cl < 2000) {
            cl = 2000;
        } else if (cl > 5000) {
            cl = 5000;
        }

        // Calculate Travel Allowance (TA)
        double ta = basicPay * 0.575;  // 57.5% of Basic Pay
        if (ta < 300) {
            ta = 300;
        }

        // Calculate Medical Allowance (MA)
        double ma = basicPay * 0.735;  // 73.5% of Basic Pay
        if (ma > 2000) {
            ma = 2000;
        }

        // Display the results
        System.out.printf("Basic Pay: $%.2f\n", basicPay);
        System.out.printf("Cost of Living (CL): $%.2f\n", cl);
        System.out.printf("Travel Allowance (TA): $%.2f\n", ta);
        System.out.printf("Medical Allowance (MA): $%.2f\n", ma);
    }
}