//leetcode Problem No.: 54
//Difficulty: 🟠 Medium

public class SpiralMatrix {
    // Print spiral order
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("empty matrix");
            return;
        }

        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        StringBuilder sb = new StringBuilder();

        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int j = startCol; j <= endCol; j++) sb.append(matrix[startRow][j]).append(' ');

            // right col
            for (int i = startRow + 1; i <= endRow; i++) sb.append(matrix[i][endCol]).append(' ');

            // bottom row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) sb.append(matrix[endRow][j]).append(' ');
            }

            // left col
            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) sb.append(matrix[i][startCol]).append(' ');
            }

            startRow++; endRow--;
            startCol++; endCol--;
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        // fixed input matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        printSpiral(matrix);
    }
}
