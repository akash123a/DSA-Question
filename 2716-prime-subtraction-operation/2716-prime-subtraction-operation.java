    class Solution {
            public boolean isPrime(int n){
                for(int j=2 ; j <= Math.sqrt(n);j++){
                    if(n % j == 0 ){
                        return false;
                    }
                }
                return true;    
            }
        public boolean primeSubOperation(int[] nums) {
                int prev =0 ;
                for(int i=0 ; i < nums.length; i++){
                    int upperBond = nums[i] - prev;
                    int largestprime =0 ;
                    for(int j= upperBond -1 ; j >= 2; j--){
                        if(isPrime(j)){
                            largestprime =j;
                            break;
                        }
                    }
                    if(nums[i]  - largestprime  <= prev){
                        return false;
                    }
                    prev = nums[i] - largestprime;
                }
                return true;
        }
    }