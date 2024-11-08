package sheet1;


import java.util.Scanner;

public class Question_20 {
	public static void main(String []args) {
		Scanner in= new Scanner(System.in);
		int numRows,z=0;
		int j;
		while(true) {
		System.out.println("Enter the number of rows");
		numRows=in.nextInt();
		if(numRows==-1)
			break;
		for(int i=0;i<=numRows;i++) {
			for( j=numRows;j>i-1;j--)
				System.out.print(" ");
		for(int k=0;k<j;k++) {
		z++;
			System.out.print(z+" ");
			
		}
		System.out.println("\n");
		}
		}
		
	in.close();	
	}

}
