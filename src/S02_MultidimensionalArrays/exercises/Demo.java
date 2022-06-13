package S02_MultidimensionalArrays.exercises;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] old = new int[4][4];
        fillMatrix(old, scanner);
        int [][] copied = new int[2][4];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                copied[row][col] = old[row][col];
            }
        }
        printMatrix(copied);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
