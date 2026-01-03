import java.util.*;

class Solution {

    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(0, amount, coins, dp);
        return ans >= 1000000000 ? -1 : ans;
    }

    public int solve(int idx, int amount, int[] coins, int[][] dp) {

        if (amount == 0) return 0;
        if (idx == coins.length) return 1000000000;

        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }

        int notTake = solve(idx + 1, amount, coins, dp);

        int take = 1000000000;
        if (coins[idx] <= amount) {
            take = 1 + solve(idx, amount - coins[idx], coins, dp);
        }

        dp[idx][amount] = Math.min(take, notTake);
        return dp[idx][amount];
    }
}
