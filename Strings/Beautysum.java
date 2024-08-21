// problem link = https://leetcode.com/problems/longest-palindromic-substring/description/
class Solution {
    public int beautySum(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int[] charFreq = new int[26]; // Create a new array to store character frequencies
            
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);      // Get the character at position j
                charFreq[c - 'a']++;       // Update the frequency of character c
                sum += beautySum(charFreq); // Add the beauty sum of current substring
            }
        }
        
        return sum;
    }
    
    private int beautySum(int[] charFreq) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int count : charFreq) {        // Go through each character's frequency
            if (count > 0) {               // Ignore characters with 0 frequency
                max = Math.max(max, count); // Find the maximum frequency
                min = Math.min(min, count); // Find the minimum frequency
            }
        }
        
        return max - min;                   // Return the difference (beauty)
    }
}
