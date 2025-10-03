class Solution {
    public boolean isAnagram(String s, String t) {
        

        char arr[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        

       Arrays.sort(arr);
       Arrays.sort(arr2);

       if(arr.length !=arr2.length){
        return false;
       }


       for(int i=0;i<arr.length;i++){
         
         if(arr[i] != arr2[i]){
                return false;
         }
       }


       return true;

    }
}