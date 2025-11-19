class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sub_array=max_subarray(nums);

        int totalsum=0;
        for(int i =0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        int neg[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            neg[i]=-nums[i];
        }

        int max_sub_array_on_neg=max_subarray(neg);
        int minsubarray=-max_sub_array_on_neg;


        if(minsubarray == totalsum){
            return max_sub_array;
        }

        int max_circular=totalsum -minsubarray;

        return Math.max(max_circular,max_sub_array);

    }

    public static int max_subarray(int [] nums){
        int maxcurrent=nums[0];
        int maxGlobal=nums[0];

        for(int i=1;i<nums.length;i++){
            maxcurrent=Math.max(nums[i],maxcurrent + nums[i]);
            maxGlobal=Math.max(maxcurrent,maxGlobal);
        }

        return maxGlobal;
    }
}