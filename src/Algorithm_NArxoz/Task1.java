package Algorithm_NArxoz;
public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = {                          // Create this matrix as an example
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = Solution.sumMatrix(matrix);   // Then create a new variable to store the result
        System.out.println("Sum of matrix elements: " + result);
    }
}

class Solution {
    public static int sumMatrix(int[][] matrix) {
        int n = matrix.length;    // Determine the size of the matrix (number of rows)
        int sum = 0;              // Variable to store the sum of matrix elements
        for (int i = 0; i < n; i++) {             // Outer loop to iterate through the rows
            for (int j = 0; j < n; j++) {         // Inner loop to iterate through the columns
                sum += matrix[i][j];              // Add the matrix element to the sum variable
            }
        }
        return sum;                               // Return the total sum of all matrix elements
    }
}

