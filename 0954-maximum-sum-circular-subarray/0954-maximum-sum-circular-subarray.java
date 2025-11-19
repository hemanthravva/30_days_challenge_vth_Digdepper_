class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsubarr=max_sub_array(nums);

        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }


        int neg[]=new int [nums.length];

        for(int i=0;i<nums.length;i++){
            neg[i]=- nums[i];
        }

        int max_sub_neg=max_sub_array(neg);

        int min_sub_arr=-max_sub_neg;

        if( min_sub_arr == totalsum)return  maxsubarr;


        int max_circular=totalsum-min_sub_arr;

        return Math.max(max_circular,maxsubarr);
         
    }

    public static int max_sub_array(int nums[]){
         int maxcurrent=nums[0];
         int max_global=nums[0];
         

         for(int i=1;i<nums.length;i++){
            maxcurrent=Math.max(nums[i],maxcurrent+nums[i]);
            max_global=Math.max(maxcurrent,max_global);
         }

         return max_global;

    }
}