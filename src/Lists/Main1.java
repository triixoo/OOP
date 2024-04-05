package Lists;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <=10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 7; i++) {
            stack.pop();
        }
        Integer addednumbers = stack.peek();
        System.out.println(addednumbers);
    }
}
