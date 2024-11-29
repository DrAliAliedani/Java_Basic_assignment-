package sheet2;


import java.util.Scanner;

public class Prime{
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}

// Sample Input/Output

	
public static void main(String arg[]) {
	int num=0;
	Scanner in=new Scanner(System.in);
	while(num != -1) {
	System.out.println("Enter the number or -1 to exist the program");
	num=in.nextInt();
	if(num !=-1) {
	if(isPrime(num)) 

System.out.println("the number "+ num+"  is prime ");
else
	System.out.println("the number "+ num+"  is not prime ");

	}}
}
//in.close();
}