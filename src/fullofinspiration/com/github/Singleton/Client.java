package fullofinspiration.com.github.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1 == singleton2);
    }
}
