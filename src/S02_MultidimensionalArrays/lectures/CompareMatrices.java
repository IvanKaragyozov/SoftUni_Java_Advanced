package S02_MultidimensionalArrays.lectures;

import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int firstMatrixRows = Integer.parseInt(input[0]);
        int firstMatrixCols = Integer.parseInt(input[1]);
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        fillFirstMatrix(firstMatrix, scanner);

        int secondMatrixRows = Integer.parseInt(input[0]);
        int secondMatrixCols = Integer.parseInt(input[1]);
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        for (int row = 0; row < secondMatrixRows; row++) {
            for (int col = 0; col < secondMatrixCols; col++) {
                // fill the matrix manually
                secondMatrix[row][col] = scanner.nextInt();
            }
        }
        if(firstMatrix.length == secondMatrix.length) System.out.println("equal");
        if(firstMatrixRows != secondMatrixRows || firstMatrixCols != secondMatrixCols) {
            System.out.println("not equal");
        }


    }
    private static void fillFirstMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                // fill the matrix manually
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    private static void fillSecondMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                // fill the matrix manually
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
