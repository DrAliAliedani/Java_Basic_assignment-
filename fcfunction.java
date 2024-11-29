package sheet2;

import java.util.Scanner;

public class fcfunction{
public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Sample Input/Output

	
public static void main(String arg[]) {
	int num=0;
	Scanner in=new Scanner(System.in);
	while(num != -1) {
	System.out.println("Enter the number or -1 to exist the program");
	num=in.nextInt();
	if (num>0) {
System.out.println("the factorial of the number "+ num+"  is  "+factorial(num)); // Output: 120
	}
	else
		break;
}
}
//in.close();
}