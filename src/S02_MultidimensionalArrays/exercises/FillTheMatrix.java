package S02_MultidimensionalArrays.exercises;

import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"3, A".split(", ") -> ["3", "A"]
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];

        int [][] matrix = new int [n][n];
        if (pattern.equals("A")) {
            //pattern A -> по колони
            fillMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            //pattern B -> aко колоната е четна (редовете от първия към последния);
            // ако колоната е нечетна (редовете от последния към първия)
            fillMatrixPatternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int startNumber = 1;
        //четна колона -> редове от 0 до последния
        //нечетна колона -> редове от последния към 0
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }
}
