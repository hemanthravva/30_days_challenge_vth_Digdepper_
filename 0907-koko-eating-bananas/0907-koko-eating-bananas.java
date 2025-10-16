class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=0;

        for(int pile :piles){
            if(pile > high){
                high=pile;
            }
        }

        long mink=high;

        while(low <=high){
            long k=low+(high-low)/2;

            if(canFinish(piles,k,h)){
                mink=k;
                high=k-1;
            }else{
                low=k+1;
            }
        }

        return (int) mink;
    }


    public boolean canFinish(int piles[],long k,int h){
        long totalTime=0;

        for(int pile : piles){
            long hoursForpiles=(pile+k-1)/k;
            totalTime+=hoursForpiles;


            if(totalTime>h){
                return false;
            }
        }

        return  totalTime<=h;
    }
}