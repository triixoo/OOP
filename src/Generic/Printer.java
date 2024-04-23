package Generic;
public class Printer<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printValue() {
        System.out.println("Value is " + value);
    }

    public void refresh() {
        value = null;
        System.out.println("Printer refreshed. Value is now null.");
    }
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.setValue("kettk");
                stringPrinter.printValue();
        stringPrinter.refresh();
        stringPrinter.printValue();
    }
}
