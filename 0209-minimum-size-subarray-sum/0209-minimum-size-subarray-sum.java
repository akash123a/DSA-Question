class Solution {
    public int minSubArrayLen(int target, int[]arr) {
                int n = arr.length;
                    int sum =0 ;
                int ans =  Integer.MAX_VALUE ;

                for(int l= 0 , r = 0 ; r < n ;r++){
                    sum += arr[r];
                    while(sum >= target ){
                        ans = Math.min(ans,  r - l  + 1 );
                        sum -= arr[l++];
                    }   
                }
                return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}