package fullofinspiration.com.github.factorymethod;

public class Client {
    public static void main(String[] args) {
        Factory factory = new PlusFactory();
        Operator operator  = factory.getOperator();
        System.out.println(operator.makeOperation(1, 2));
    }
}
