package fullofinspiration.com.github.factorymethod;

public class MinusOperator implements Operator {
    @Override
    public double makeOperation(double m, double n) {
        return m - n;
    }
}
