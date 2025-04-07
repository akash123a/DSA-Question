class Solution {
    public boolean canPartition(int[] nums) {

                int sum =0 ;
                for(int i: nums){
                    sum += i;
                }
                if(sum % 2 != 0 ){
                    return false;
                }
                int target = sum /2 ;

                boolean []  sub = new boolean [target + 1];
                        sub[0] = true;

                    for(int i :  nums){
                            
                            for(int j = target; j >=i; j--){
                                    sub[j] = sub[j] || sub[j - i]; 
                            }
                    }       

                    return sub[target];
    }
}