class Solution {
    public int findLHS(int[] nums) {

        Map<Integer , Integer >  hs = new HashMap<>();

            for(int num : nums){

                hs.put(num, hs.getOrDefault(num,0) + 1 ) ;

            }
                    int l =0 ;

                for(int num : nums){
                    if(hs.containsKey(num + 1)  ){
                        int cur = hs.get(num) + hs.get(num+1);
                      l = Math.max(l,cur);
                    }
                }

                return l;



    }
}