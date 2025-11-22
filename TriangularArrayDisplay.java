public class TriangularArrayDisplay {

    public static void getLower(int[][] matrix, int size) {
        System.out.println("Lower:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void getUpper(int[][] matrix, int size) {
        System.out.println("Upper:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3;

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        getLower(matrix1, size);
        getUpper(matrix1, size);


        int[][] matrix2 = {
                {7, 8, 9},
                {3, 2, 1},
                {6, 5, 4}
        };
        getLower(matrix2, size);
        getUpper(matrix2, size);
    }
}