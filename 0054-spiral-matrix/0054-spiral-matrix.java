class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
                List<Integer>  res = new ArrayList<>();
                int m =  mat.length;
                int n = mat[0].length;
                int top = 0 ;
                int down = m -1;
                int left =0 ;
                int right = n -1 ;

            while(top <= down && left <= right ){
                for(int i= left ; i <= right ; i++){
                    res.add(mat[top][i]);
                   }
                top++;
                for(int i= top ; i <= down ; i++){
                    res.add(mat[i][right]);
                }
                right--;
                if(top <= down ){
                    for(int i = right; i  >= left ; i--){
                        res.add(mat[down][i]) ;
                       }
                       down--;
                }
                if(left <= right){
                    for(int i= down ; i >= top ; i--){
                        res.add(mat[i][left]);
                    }
                    left++;
                }
 
            }
            return res;
    }
}