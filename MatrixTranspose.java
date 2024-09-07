public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    /**
     * Transposes a given matrix.
     *
     * @param matrix the input matrix
     * @return the transposed matrix
     */
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    /**
     * Prints a matrix to the console.
     *
     * @param matrix the matrix to print
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}