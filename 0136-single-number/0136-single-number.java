class Solution {
    public int singleNumber(int[] nums) {
        int size= nums.length;
        int arr[]=new int[size];
        int result=0;

        for(int i :nums){
           result=result^i;
        }
         

        return result;
    }
}