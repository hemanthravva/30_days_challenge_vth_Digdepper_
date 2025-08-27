class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int[] result = new int[size];
        
        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = -1; 
            int nextGreater = -1; 
            
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    indexInNums2 = j;
                    break;
                }
            }
            
            
            for (int j = indexInNums2 + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            
            result[i] = nextGreater;
        }
        
        return result;
    }
}