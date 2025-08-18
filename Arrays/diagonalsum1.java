//leetcode 1572 optimise approach of diagonal sum
class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal (avoid double count)
            if(i != n - 1 - i){
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }
}
