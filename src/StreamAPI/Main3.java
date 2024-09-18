package StreamAPI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        int max = numbers.stream()
                .mapToInt(Integer:: intValue)
                .max()
                .orElseThrow();
        System.out.println("нахождения \n" +
                "наибольшего элемента = " + max);
    }
}
