package fullofinspiration.com.github.factorymethod;

public class PlusFactory implements Factory {
    @Override
    public Operator getOperator() {
        return new PlusOperator();
    }
}
