import java.util.*; 
class Solution {
    public boolean isHappy(int n) {
        while(n>=10){
            int sum=0;
            int rem=0;
            while(n>0){
                rem=n%10;
                sum+=(rem*rem);
                n=n/10;

            }
            n=sum;
        } 
        if(n == 1 || n== 7){
            return true;
        }
        return false;
    }
}