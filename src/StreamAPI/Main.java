package StreamAPI;
public class Main {
    public static void main(String[] args) {
        SumOperation sum = new SumOperation();
        int result = SumOperation.getSum(5, 10);
        System.out.println(result);
    }
}
