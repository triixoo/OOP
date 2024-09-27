package Algorithm_NArxoz;
import java.util.*;

public class MaxProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            System.out.printf("1 1 %d%n", i + 1); // Multiply first element with others
            arr[i] = arr[0] * arr[i]; // Update the product
        }
        System.out.println("2 1"); // Remove the last remaining element
        sc.close();
    }
}


