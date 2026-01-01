class Solution {
    int offset;
    Integer[][] dp;

    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int x : nums) total += x;

        offset = total;
        dp = new Integer[nums.length][2 * total + 1];

        return f(0, 0, nums, target);
    }

    private int f(int i, int sum, int[] nums, int target) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp[i][sum + offset] != null)
            return dp[i][sum + offset];

        int take = f(i + 1, sum + nums[i], nums, target);
        int notTake = f(i + 1, sum - nums[i], nums, target);

        return dp[i][sum + offset] = take + notTake;
    }
}
