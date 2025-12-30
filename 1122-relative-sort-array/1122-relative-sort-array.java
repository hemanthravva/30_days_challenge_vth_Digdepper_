class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       HashMap<Integer,Integer> map =new HashMap<>();

       for(int i=0;i<arr2.length;i++){
        map.put(arr2[i],i);
       }

       TreeMap<Integer,Integer> countmap=new TreeMap<>();

       for(int num : arr1){
        countmap.put(num,countmap.getOrDefault(num,0)+1);
       }

       int result[]=new int[arr1.length];
       int index=0;

       for(int num:arr2){
            if(countmap.containsKey(num)){
                int count=countmap.get(num);
                while(count-->0){
                    result[index++]=num;
                }
                countmap.remove(num);
            }
       }


       for(Map.Entry<Integer,Integer> entry: countmap.entrySet()){
        int count=entry.getValue();

        while(count-->0){
            result[index++]=entry.getKey();
        }
       }

       return result;
    }
}