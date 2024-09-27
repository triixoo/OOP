package Algorithm_NArxoz;

import java.util.Scanner;

public class MaxProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int max1 = 0, max2 = 1;
        if (a[max1] < a[max2]) {
            max1 = 1;
            max2 = 0;
        }

        for (int i = 2; i < n; i++) {
            if (a[i] > a[max1]) {
                max2 = max1;
                max1 = i;
            } else if (a[i] > a[max2]) {
                max2 = i;
            }
        }

        StringBuilder out = new StringBuilder();
        out.append("1 ").append(max1 + 1).append(" ").append(max2 + 1).append("\n");
        a[max2] *= a[max1];
        a[max1] = Long.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] != Long.MIN_VALUE) {
                    out.append("1 ").append(max2 + 1).append(" ").append(j + 1).append("\n");
                    a[j] *= a[max2];
                    a[max2] = Long.MIN_VALUE;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != Long.MIN_VALUE) {
                out.append("2 ").append(i + 1).append("\n");
                break;
            }
        }

        System.out.print(out);
        sc.close();
    }
}