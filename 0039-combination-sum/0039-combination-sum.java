class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result = new ArrayList<>();

        List<Integer> ds= new ArrayList<>();

        func(0,candidates,target,ds,result);

        return result;
    }

    public static void  func(int idx,int candidates[] ,int target , List<Integer> ds,List<List<Integer>> result){

        if (idx == candidates.length){  
            if ( target == 0){
                result.add(new ArrayList<>(ds) );
                
            }
            return ;
        }

        if (candidates[idx] <=target){
            ds.add(candidates[idx]);

            func(idx,candidates,target-candidates[idx],ds,result);
            ds.remove(ds.size()-1) ;
        }

        func(idx+1,candidates,target,ds,result);

    }
}