package sheet2;

import java.util.Scanner;

public class FAB {
	public static int fibonacci(int n) {
	   
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    int a = 0, b = 1, fib = 0;
	    for (int i = 2; i <= n; i++) {
	        fib = a + b;
	        a = b;
	        b = fib;
	    }
	    return fib;
	}
public static void main(String arg[]) {
	// Sample Input/Output
	int num=0;
	Scanner in=new Scanner(System.in);
	while(num>=0) {
	System.out.println("Enter the number or -1 to exist the program");
	num=in.nextInt();
	if(num >=0) 
	System.out.println(fibonacci(num)); // Output: 0
	else 
		break;

	}
	}
}
