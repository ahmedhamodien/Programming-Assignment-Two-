public class SymmetricArrayMapping {


    public static int[] mapLowerTriangular(int[][] matrix, int N) {
        int size1D = N * (N + 1) / 2;
        int[] array1D = new int[size1D];
        int k = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i >= j) {
                    k = (i * (i + 1)) / 2 + j;
                    array1D[k] = matrix[i][j];
                }
            }
        }
        return array1D;
    }

    public static void main(String[] args) {
        int[][] symmetricMatrix = {
                {10, 15, 20},
                {15, 30, 25},
                {20, 25, 40}
        };
        int N = symmetricMatrix.length;

        System.out.println("--- Symmetric Array Mapping ---");
        System.out.println("2D Matrix (Lower Triangle to be Stored):");
        for (int[] row : symmetricMatrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }

        int[] oneDArray = mapLowerTriangular(symmetricMatrix, N);

        System.out.println("\n1D Array Representation (Lower Triangular Part):");
        System.out.print("[");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + (i < oneDArray.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Size of 1D Array: " + oneDArray.length);
    }
}
