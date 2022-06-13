package S02_MultidimensionalArrays.lectures;

public class Example {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int count = 1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = count++;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
