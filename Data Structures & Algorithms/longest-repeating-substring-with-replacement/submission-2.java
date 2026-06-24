class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 0) return 0;
        
        int left = 0;
        int maxFreq = 0; // Tracks the count of the most frequent char in the window
        int res = 0;      // Tracks the final answer (longest window)
        int charSet[] = new int[26];

        for (int right = 0; right < s.length(); right++) {
            charSet[s.charAt(right) - 'A']++;

            // 1. Update the frequency of the most common character in the current window
            maxFreq = Math.max(maxFreq, charSet[s.charAt(right) - 'A']);

            // 2. Check if the current window is invalid
            // (Window Length - Frequency of most common char) = replacements needed
            while ((right - left + 1) - maxFreq > k) {
                charSet[s.charAt(left) - 'A']--;
                left++;
                // Note: We don't technically need to decrement maxFreq here 
                // because a smaller maxFreq wouldn't give us a better result anyway.
            }

            // 3. Update the overall result with the current valid window size
            res = Math.max(res, right - left + 1);
        }
        return res; // Return the best result found
    }
}