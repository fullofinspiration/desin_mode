package fullofinspiration.com.github.factorymethod;

public class MinusFactory implements Factory {
    @Override
    public Operator getOperator() {
        return new MinusOperator();
    }
}
