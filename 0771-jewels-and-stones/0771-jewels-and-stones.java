class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count=0;

        char arr[]=jewels.toCharArray();

        char arr2[]=stones.toCharArray();
        
        for(char c : arr){
            for(char x : arr2){
                if ( c == x){
                    count++;
                }
            }
        }

        return count;
    }
}