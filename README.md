# Java_LongSunStr

To find the longest Non Repeated Substring

Explanation:

- We use a sliding window approach with two pointers, `left` and `right`. The `left` pointer marks the start of the current substring, and the `right` pointer iterates through the string.

- We use a HashMap called `charIndexMap` to keep track of the most recent index of each character encountered in the string.

- When a repeating character is encountered (i.e., it's already in the `charIndexMap`), we move the `left` pointer to the next position after the last occurrence of that character. This ensures that we maintain a substring without repeating characters.

- At each step, we update the `maxLength` by taking the maximum value between the current `maxLength` and the length of the current substring (i.e., `right - left + 1`).

- The final value of `maxLength` will be the length of the longest substring without repeating characters.

The time complexity of this solution is O(n), where n is the length of the input string, as each character is processed only once. The space complexity is O(min(n, m)), where m is the size of the character set (e.g., for ASCII characters, m = 128).
