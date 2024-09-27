package Algorithm_NArxoz;

import java.util.*;

public class BoxNesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] firstLine = sc.nextLine().trim().split("\\s+");
            if (firstLine.length == 0) break;

            int k = Integer.parseInt(firstLine[0]);
            int n = Integer.parseInt(firstLine[1]);
            int[][] boxes = new int[k][n];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    boxes[i][j] = sc.nextInt();
                }
                sc.nextLine();
            }

            List<Integer> result = findLongestNesting(boxes);
            System.out.println(result.size());
            result.forEach(index -> System.out.print((index + 1) + " "));
            System.out.println();
        }
        sc.close();
    }

    private static List<Integer> findLongestNesting(int[][] boxes) {
        int k = boxes.length;
        int[] dp = new int[k];
        int[] prev = new int[k];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        Arrays.sort(boxes, Comparator.comparingInt(a -> Arrays.stream(a).sum()));

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i; j++) {
                if (canNest(boxes[j], boxes[i]) && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < k; i++) {
            if (dp[i] > dp[maxIndex]) maxIndex = i;
        }

        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(maxIndex);
            maxIndex = prev[maxIndex];
        }
        Collections.reverse(result);
        return result;
    }

    private static boolean canNest(int[] box1, int[] box2) {
        Arrays.sort(box1);
        Arrays.sort(box2);
        for (int i = 0; i < box1.length; i++) {
            if (box1[i] >= box2[i]) return false;
        }
        return true;
    }
}
