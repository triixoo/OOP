package Set;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 20, 40, 100};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int number : numbers) {
            hashSet.add(number);
        }
        System.out.println("Number of unique numbers: " + hashSet.size());
    }
}
