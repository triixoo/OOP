package Algorithm_NArxoz;
import java.util.ArrayList;

public class LinearSearch {
    static class Solution {
        // Linear search for ArrayList<Integer>
        public int linearSearch(ArrayList<Integer> list, int target) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Searching for an existing value
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        int target1 = 3;
        System.out.println("Search for target " + target1 + " in list1: " + solution.linearSearch(list1, target1));

        // Test case 2: Searching for a value not present in the list
        int target2 = 6;
        System.out.println("Search for target " + target2 + " in list1: " + solution.linearSearch(list1, target2));

        // Test case 3: Searching in an empty list
        ArrayList<Integer> emptyList = new ArrayList<>();
        int target3 = 1;
        System.out.println("Search for target " + target3 + " in empty list: " + solution.linearSearch(emptyList, target3));
    }
}


