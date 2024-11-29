package sheet2;
import java.util.Scanner;

public class reverse {
    public static String rev(String str) {
        if (str == null) {
            return null; // Handle null input
        }
        String result=new String();
        char ch;
        for (int i=str.length()-1;i>=0; i--) {
             ch = str.charAt(i);
             result = result.concat(Character.toString(ch));
        }
        return result;
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter the String ");
            String testString =in.next();
        if(!testString.equals(null))
        System.out.println("string in reverse is   : " + rev(testString));
        else
        	break;
    	}
    }
}