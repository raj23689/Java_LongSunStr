import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0; // left pointer of the sliding window
        HashMap<Character, Integer> charIndexMap = new HashMap<>(); // stores the most recent index of each character

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charIndexMap.containsKey(c)) {
                left = Math.max(left, charIndexMap.get(c) + 1); // move the left pointer to the next position after the last occurrence of c
            }
            charIndexMap.put(c, right); // update the index of the current character

            maxLength = Math.max(maxLength, right - left + 1); // update the maximum length
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstring solution = new LongestSubstring();
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + length);
    }
}
