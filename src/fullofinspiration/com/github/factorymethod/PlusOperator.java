package fullofinspiration.com.github.factorymethod;

public class PlusOperator implements Operator {
    @Override
    public double makeOperation(double m, double n) {
        return m + n;
    }
}
