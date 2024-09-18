package Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(0);
        list.add(3);
        Collections.sort(list, Collections.reverseOrder());
        for (Integer lists : list) {
            System.out.print(lists + ", ");
        }
    }
}
