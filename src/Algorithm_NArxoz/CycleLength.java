package Algorithm_NArxoz;
import java.util.Scanner;

public class CycleLength {

    // Calculate the cycle length for a given integer n
    public static int cycleLength(int n) {
        int length = 1;
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pairs of integers (i and j). Type 'exit' to quit.");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) break;

            String[] parts = line.split(" ");
            if (parts.length == 2) {
                int i = Integer.parseInt(parts[0]);
                int j = Integer.parseInt(parts[1]);
                int maxLength = 0;

                for (int n = Math.min(i, j); n <= Math.max(i, j); n++) {
                    maxLength = Math.max(maxLength, cycleLength(n));
                }
                System.out.printf("%d %d %d%n", i, j, maxLength);
            }
        }
        scanner.close();
    }
}
