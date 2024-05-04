package Task;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Comparator.reverseOrder());
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(-1);
        numbers.add(13);
        numbers.add(32);
        numbers.add(231);
        numbers.add(123);
        numbers.add(42);
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
    }
}
