class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for (int x : nums) total += x;

        // sum range: [-total .. +total]
        int dp[][] = new int[n][2 * total + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(0, 0, nums, target, dp, total);
    }

    public static int f(int idx, int sum, int nums[], int target,
                        int dp[][], int offset) {

        if (idx == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp[idx][sum + offset] != -1) {
            return dp[idx][sum + offset];
        }

        int take = f(idx + 1, sum + nums[idx], nums, target, dp, offset);
        int not_take = f(idx + 1, sum - nums[idx], nums, target, dp, offset);

        return dp[idx][sum + offset] = take + not_take;
    }
}
