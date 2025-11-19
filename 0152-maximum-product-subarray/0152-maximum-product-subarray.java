class Solution {
    public int maxProduct(int[] nums) {
        int maxcurrent=nums[0];
        int mincurrent=nums[0];
        int maxGlobal=nums[0];

        for(int i=1;i<nums.length;i++){
            
            int temp=maxcurrent;

            maxcurrent=Math.max(nums[i],Math.max(maxcurrent*nums[i],mincurrent*nums[i]));
            mincurrent=Math.min(nums[i],Math.min(temp*nums[i],mincurrent*nums[i]));

            maxGlobal=Math.max(maxGlobal,maxcurrent);
        }

        return maxGlobal;

        
    }
}