package S02_MultidimensionalArrays.lectures;

import java.util.Scanner;

public class SumMatrixElements {

    public static void main(String[] args) {

        //read the size of the matrix
        Scanner scanner = new Scanner(System.in);
        String[] sizeOfMatrix = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);
        int[][] matrix = new int[rows][cols];

        //read the matrix
        for (int row = 0; row < rows; row++) {
            String[] rowOfMatrix = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }

        //sum the elements of the matrix
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum = sum + matrix[row][col];
            }
        }
        //print result
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
