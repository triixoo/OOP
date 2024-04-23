package StreamAPI;

public class Main2 {
    public static void main(String[] args) {
        Operator powerOperator = (a, b) -> {
            PowerOperation powerOperation = new PowerOperation();
            return powerOperation.getPower(a, b);
        };
        int result = powerOperator.toOperate(4, 4);
        System.out.println(result);
    }
}
