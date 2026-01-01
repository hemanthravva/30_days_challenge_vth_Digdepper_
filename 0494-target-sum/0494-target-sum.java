class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return f(0, 0, nums, target);
    }

    private int f(int i, int sum, int[] nums, int target) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        int take = f(i + 1, sum + nums[i], nums, target);
        int notTake = f(i + 1, sum - nums[i], nums, target);

        return take + notTake;
    }
}
