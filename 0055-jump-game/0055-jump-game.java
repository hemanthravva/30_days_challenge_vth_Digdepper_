class Solution {
    public boolean canJump(int[] nums) {
        int maxrange=0;

        for(int i=0;i<nums.length;i++){

            if(i>maxrange){
                return false;
            }


            maxrange=Math.max(maxrange,i+nums[i]);
        }


        return true;
    }
}