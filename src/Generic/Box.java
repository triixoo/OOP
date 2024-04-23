package Generic;
import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> contents = new ArrayList<>();
    public Box(){}
    public Box(List<T> initialContents) {
        this.contents.addAll(initialContents);
    }
    public void add(T item) {
        contents.add(item);
    }
    public List<T> getContents() {
        return new ArrayList<>(contents);
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);

        List<Integer> contents = integerBox.getContents();
        System.out.println("Box contents: " + contents);

        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");

        List<String> stringContents = stringBox.getContents();
        System.out.println("String box contents: " + stringContents);
    }
}
