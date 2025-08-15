//problem no 74 leetcode medium level

import java.util.*;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {  // added static
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("found at pos: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchMatrix(matrix, 5);

        sc.close();
    }
}
