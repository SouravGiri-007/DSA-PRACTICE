class IsPalindrome {

    
        // Function to find the longest palindromic substring
        public static String longestPalindrome(String str) {
            String res = "";  // To store the result
            int len = str.length();  // Length of the string

            // Iterate over substring lengths from longest to shortest
            while (len > 0) {
                // Try every substring of the current length
                for (int i = 0; i <= str.length() - len; i++) {
                    // If a palindromic substring is found, return it immediately
                    if (isPalindrome(str.substring(i, i + len))) {
                        return str.substring(i, i + len);
                    }
                }
                // Decrease the length and check for smaller substrings
                len--;
            }
            return res;  // In case no palindrome is found (edge case)
        }

        // Function to check if a given string is a palindrome
        public static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;  // Two-pointer approach
            // Check characters from both ends
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;  // Return false if mismatch is found
                }
                i++;  // Move the left pointer to the right
                j--;  // Move the right pointer to the left
            }
            return true;  // Return true if the string is a palindrome
        }
    }

