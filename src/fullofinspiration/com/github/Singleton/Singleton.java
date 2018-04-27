package fullofinspiration.com.github.Singleton;

/**
 * 对饱汉模式优化，线程安全，
 * 为什么使用volatile关键字是为了防止指令重排序：
 *          对于new操作并不是原子操作，当new时分三步，第一步选取内存空间，第二步对内存初始化，
 *          第三步将指针指向该内存。如果不使用volatile关键字，在单线程时上面三步是可以打乱的，
 *          但是如果第二三部打乱，即先分配内存，再初始化，其他线程读取时，读到该内存不为空，就
 *          开始使用，但是实际上还没有初始化就会报错
 * 然后使用sycronized将该对象加锁
 */
public class Singleton {
    public Singleton() {

    }
    public volatile Singleton singleton = null;

    public Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
