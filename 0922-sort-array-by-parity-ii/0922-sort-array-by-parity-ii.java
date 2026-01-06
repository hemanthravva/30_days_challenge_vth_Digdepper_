class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int result[]=new int [nums.length];

        int idx=0;
        int id=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 ==0){
                result[idx]=nums[i];
               idx+=2;
                
            }else{
                result[id]=nums[i];
                id+=2;
            }
            
           
        }

        return result;
        
    }
}