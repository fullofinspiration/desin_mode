package fullofinspiration.com.github.Singleton;

/**
 * 饿汉式，线程安全，但是不需要的时候都需要初始化有点浪费时间
 */
public class HungarySingleton {
    public HungarySingleton() {

    }

    public static final HungarySingleton hungarySingleton = new HungarySingleton();

    public static HungarySingleton getHungarySingleton() {
        return hungarySingleton;
    }
}
