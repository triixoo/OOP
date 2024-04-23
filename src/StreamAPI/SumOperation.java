package StreamAPI;
public class SumOperation{
    static int getSum(int a, int b){
        Operator operator = (x,y) -> x+y;
        return operator.toOperate(a, b);
    }
}

