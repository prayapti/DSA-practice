//leetcode 
//1572 diagonal sum BRUTE FORCE APPROACH 

class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum=0;
        for(int i=0; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    //primary diagonal
                    sum+=matrix[i][j];
                }
                else if(j==matrix.length-1-i){
                    //secondary diagonal
                    sum+=matrix[i][j];
                }
            }
        }
         return sum;

        
    }
}
