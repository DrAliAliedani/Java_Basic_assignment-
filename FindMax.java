package sheet2;

import java.util.Scanner;

public class FindMax {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max; // Return the largest element
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the size of the array  ");
    	int n=in.nextInt();
    	
          int[] testArray =new int[n];
          for(int i=0;i<testArray.length;i++) {
        	  System.out.print("Enter the value of "+i+" element");
        	  testArray[i]=in.nextInt();
          }
          
        System.out.println("The largest element is: " + findMax(testArray));
    }
}