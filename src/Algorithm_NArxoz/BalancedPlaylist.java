package Algorithm_NArxoz;
import java.util.Scanner;

public class BalancedPlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] coolness = new long[n];
        for (int i = 0; i < n; i++) {
            coolness[i] = scanner.nextLong();
        }

        long[] result = new long[n];

        for (int start = 0; start < n; start++) {
            result[start] = countTracks(coolness, start, n);
        }

        for (long res : result) {
            System.out.print(res + " ");
        }
    }

    private static long countTracks(long[] coolness, int start, int n) {
        long maxCoolness = coolness[start];
        long count = 0;
        int current = start;
        boolean[] visited = new boolean[n];

        while (true) {
            count++;
            visited[current] = true;
            current = (current + 1) % n;


            if (coolness[current] < maxCoolness / 2) {
                break;
            }


            maxCoolness = Math.max(maxCoolness, coolness[current]);


            if (current == start && visited[current]) {
                return -1;
            }
        }

        return count;
    }
}

