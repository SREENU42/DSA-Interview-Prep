//LinearSearch 2d Array

public class LinearSearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 2},
            {6, 4, 8}
        };

        int target = 9;

        int[] result = linearSearch2D(matrix, target);

        System.out.println("Found at: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] linearSearch2D(int[][] matrix, int target) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == target) {
                    return new int[]{row, col}; 
                }
            }
        }

        return new int[]{-1, -1}; 
    }
}
