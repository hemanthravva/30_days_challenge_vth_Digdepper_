class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList <>();
        List<Integer> ds = new ArrayList<>();

        boolean[] frq = new boolean[nums.length];
        func(nums,ds,ans,frq);
        return ans ;


    }


    public static void func(int nums[],List<Integer> ds,List<List<Integer>>  ans,boolean frq[]){


        if ( ds.size() ==nums.length ){
            ans.add(new ArrayList<>(ds));
            return ;
        }


        for ( int i =0;i<nums.length;i++){
            if (!frq[i]){
                frq[i]=true;

                ds.add(nums[i]);
                func(nums,ds,ans,frq);
                ds.remove(ds.size() -1);

                frq[i]=false;
            }
        }
    }
}