import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderIndex = new HashMap<>();
        int sum = 0;

        // Initialize to handle edge case for subarray starting at index 0
        remainderIndex.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            // Handle negative remainder
            if (remainder < 0) {
                remainder += k;
            }

            if (remainderIndex.containsKey(remainder)) {
                // Check if the subarray length is at least 2
                if (i - remainderIndex.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of the remainder
                remainderIndex.put(remainder, i);
            }
        }
        return false;
    }
}