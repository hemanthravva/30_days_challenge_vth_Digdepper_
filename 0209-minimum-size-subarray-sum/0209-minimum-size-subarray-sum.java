class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int currsum=0;
        int left=0;
       

        for(int right=0;right<nums.length;right++){
            currsum+=nums[right];

            while(currsum>= target){


                if(right-left+1 < minLen ){
                    minLen=right-left+1;
                   
                }

                currsum-=nums[left];
                left++;
            }
        }

        return (minLen==Integer.MAX_VALUE ? 0 : minLen);
    }
}