package Set;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Queue<Integer> queue = new LinkedList<>();

        for (int number : numbers) {
            queue.add(number);
        }

        Integer thirdElement = null;
        int index = 0;
        for (Integer num : queue) {
            if (index == 2) {
                thirdElement = num;
                break;
            }
            index++;
        }

        System.out.println("third element: " + thirdElement);
    }
}
