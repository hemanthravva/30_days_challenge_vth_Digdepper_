class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }

    private int backtrack(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        // Include the current element
        int include = backtrack(nums, index + 1, currentXOR ^ nums[index]);

        // Exclude the current element
        int exclude = backtrack(nums, index + 1, currentXOR);

        return include + exclude;
    }
}