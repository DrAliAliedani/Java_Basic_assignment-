package sheet2;

import java.util.Scanner;

public class VowelCounter {
    public static int Vowels(String str) {
        if (str == null) {
            return 0; // Handle null input
        }
        
        int count = 0;
        String vowels = "aeiouAEIOU"; 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) { 
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter the String ");
            String testString =in.next();
        if(!testString.equals(null))
        System.out.println("The number of vowel in string  "+testString+ "  is: " + Vowels(testString));
        else
        	break;
    	}
    }
}