class Solution {
    public int[] twoSum(int[] num, int target) {
       int left=0;
       int right=num.length-1;

       int res[]=new int[2];

       while(left <right){
        int sum = num[left] + num[right];

            if(sum == target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
                
            }else if (sum > target) {
                right--;
            }else{
                left++;
            }
         }

         return res;


    }
}