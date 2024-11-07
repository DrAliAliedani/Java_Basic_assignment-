package sheet1;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sale;
        double sale_tax, payable_net;

        System.out.print("Enter the value of sale: ");
        sale = in.nextInt();

        String Item_type;
        System.out.print("Enter the item type (national, foreign): ");
        Item_type = in.next();

        
        if (Item_type.equals("national")) {
            sale_tax = sale * 0.08; // Assuming 8% tax for national items
        } else if (Item_type.equals("foreign")) {
            sale_tax = sale * 0.18; // Assuming 18% tax for foreign items
        } else {
            System.out.println("Invalid item type entered.");
            return;
        }

        // Calculate total payable amount
        payable_net = sale + sale_tax;

        System.out.printf("The total sale price is: %.3f", payable_net);
    }

}
