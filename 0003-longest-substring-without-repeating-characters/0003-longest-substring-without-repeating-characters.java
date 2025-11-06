class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; 
        int right = 0; 
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0; 
        
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++; 
            } else {
                set.remove(s.charAt(left)); 
                left++;
            }
        }
        return maxLength;
    }
}