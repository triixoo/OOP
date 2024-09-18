package Algorithm_NArxoz;
public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = Solution.sumMatrix(matrix);
        System.out.println("Sum of matrix elements: " + result);
    }
}

class Solution {
    public static int sumMatrix(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

