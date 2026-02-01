package ScalerDSA.Beginers2;

import java.util.Scanner;

public class Array2d {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Proper input messages
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements row-wise:");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("---- Matrix ----");
        display(matrix);

        System.out.println("---- Wave Order (Column-wise) ----");
        printWaveForm_columnwise(matrix);
    }

    // Display matrix
    public static void display(int[][] mat) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }

    /*
     Problem: Print matrix in wave order (column-wise)

     EVEN column  -> top to bottom
     ODD column   -> bottom to top
    */
    public static void printWaveForm_columnwise(int[][] mat) {

        for (int c = 0; c < mat[0].length; c++) {

            if (c % 2 == 0) {
                // even column: top to bottom
                for (int r = 0; r < mat.length; r++) {
                    System.out.print(mat[r][c] + " ");
                }
            } else {
                // odd column: bottom to top
                for (int r = mat.length - 1; r >= 0; r--) {
                    System.out.print(mat[r][c] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("----");
    }
}