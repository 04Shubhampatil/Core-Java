public class Addition2D {

    public static void main(String[] args) {
        int A[][] = {
            {1, 0},
            {0, 1}
        };

        int B[][] = {
            {1, 2},
            {0, 2}
        };

        int C[][] = new int[2][2]; // For addition result
        int R[][] = new int[2][2]; // For multiplication result

        System.out.println("Sum of matrices:");
        C = sumMatrices(A, B);
        printMatrix(C);

        System.out.println("Product of matrices:");
        R = multiplyMatrices(A, B);
        printMatrix(R);
    }

    // Function to sum two matrices
    public static int[][] sumMatrices(int[][] A, int[][] B) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Utility function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
