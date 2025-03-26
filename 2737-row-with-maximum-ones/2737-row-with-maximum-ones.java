class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
                int n=mat.length;
                int m = mat[0].length;
            // int [][] res = new int[n][m];
                    int row =0 , count =0 ;
                for(int i=0; i < n; i++){
                    int tempcount  =0 ;
                    for(int j =0 ; j < m ;j++){
                            if(mat[i][j] == 1)
                                tempcount++;
                            
                    }   
               
                            if(tempcount > count){
                                    row = i ;
                                    count = tempcount;
                        
                            }
                            }
                return new int [] {row,count};
                

    }
}