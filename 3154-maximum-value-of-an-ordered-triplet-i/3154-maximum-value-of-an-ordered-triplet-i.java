class Solution {
    public long maximumTripletValue(int[] nums) {
            int n  = nums.length;
            if(n <3){
                return 0;
            }   
                    long cur = 0;
                    long ans = nums[0] ;
                    long res = Integer.MIN_VALUE ;

             for(int i=1 ; i < n-1 ; i++){
                 res = Math.max(res  ,  ans - nums[i]);
                 ans  = Math.max(ans , nums[i]);

                long triplet = (long) res * nums[i+1];

                cur = Math.max( cur, triplet);
             }
             return Math.max(0,cur);
                 
                 
    }
}