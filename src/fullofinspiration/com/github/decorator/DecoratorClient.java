package fullofinspiration.com.github.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Person man = new Man();
        Man1 man1 = new Man1();
        //Man2 man2 = new Man2();
        man1.setPerson(man);
        //man2.setPerson(man1);
        //man2.wearring();
        man1.wearring();
    }
}
