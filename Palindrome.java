package sheet2;

public class Palindrome {
    public static boolean isPalindrome(String str) {
      
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Convert to lowercase to ensure case insensitivity
        str = str.toLowerCase();

        // Initialize pointers
        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("madam"));        // Output: true
        System.out.println(isPalindrome("racecar"));      // Output: true
        System.out.println(isPalindrome("hello"));        // Output: false
        System.out.println(isPalindrome("A man a plan a canal Panama")); // Output: false (spaces not handled)
    }
}