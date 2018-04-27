package fullofinspiration.com.github.Singleton;

/**
 *饱汉式，非线程安全
 */
public class SatisfySingleton {
    public SatisfySingleton() {

    }
    public  SatisfySingleton satisfySingleton = null;

    public SatisfySingleton getSatisfySingleton() {
        if (satisfySingleton == null) {
            satisfySingleton = new SatisfySingleton();
        }
        return satisfySingleton;
    }
}
