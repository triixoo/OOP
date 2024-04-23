package Generic;
public class Pair<A, b> {
    private A first;
    private b second;

    public Pair(A first, b second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public A getFirst() {
        return first;
    }

    public b getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(b second) {
        this.second = second;
    }
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "privet");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(20);
        pair.setSecond("Narxoz");

        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());
    }
}


