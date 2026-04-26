class Solution {
    public double average(int[] salary) {
            Arrays.sort(salary);
             int n = salary.length;
            double res = 0 ;
            for(int i= 1 ; i < salary.length-1; i++){
                    res += salary[i];
            }     
            return res/(n-2);
                }
}