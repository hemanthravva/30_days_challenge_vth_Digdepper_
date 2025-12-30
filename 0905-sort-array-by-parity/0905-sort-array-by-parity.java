class Solution {
    public int[] sortArrayByParity(int[] arr) {
        
       int result[] = new int [arr.length];
        int temp=arr.length-1;
        int left=0;
       for(int i =0;i<arr.length;i++){
           if (arr[i] % 2 == 0){
            result[left]=arr[i];
            left++;
           }else{
            result[temp]=arr[i];
            temp--;
           }
           
        }
       return result;
  
    }

}