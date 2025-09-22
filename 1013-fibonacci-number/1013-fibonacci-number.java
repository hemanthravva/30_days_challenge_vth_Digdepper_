class Solution {
    public int fib(int n) {
        // if (n == 0) return 0;
        // if (n == 1) return 1;

        // int a = 0, b = 1;
        // for (int i = 2; i <= n; i++) {
        //     int temp = a + b;
        //     a = b;
        //     b = temp;
        // }
        // return b;



        //Now using recurssion 


        int ans=recurssion(n);
        return ans;

        }
        public static int  recurssion(int n){
            if(n==0||n==1){
                return n;
            }

            int ans=recurssion(n-1)+recurssion(n-2);

            return ans;
        }
    
}