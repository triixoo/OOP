package Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(1);
        number.add(5);
        number.add(4);
        number.add(3);
        Collections.sort(number);
        for (Integer numbers : number) {
            System.out.print(numbers + " ");
        }
    }
}
