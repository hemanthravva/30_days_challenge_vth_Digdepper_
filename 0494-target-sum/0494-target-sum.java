class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return  f(0,0,nums,target);
    }

    public static int f(int idx,int sum,int nums[],int target){
        if (idx == nums.length) {
            return sum == target ? 1 : 0;
        }

        //pick
      int take=f(idx+1,sum+nums[idx],nums,target);
      int not_take=f(idx+1,sum-nums[idx],nums,target);


      return take+not_take;
    }
}