package create.singleton.lazy;

public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懒汉式单例，是线程安全，但效率低，不推荐使用");

        SingletonType4 instance1 = SingletonType4.getInstance();
        SingletonType4 instance2 = SingletonType4.getInstance();

        System.out.println("instance1.hashcode=" + instance1.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }

}

// 单例（懒汉式，线程安全）
class SingletonType4 {
    // 0. 设置静态实例对象
    private static SingletonType4 instance;

    // 1. 私有化构造方法，外部不能new
    private SingletonType4() {

    }

    // 2. 在公共方法中实例化对象并返回
    // 在方法上加入同步标志，这样在多线程时会等待了，即线程安全了。
    public static synchronized SingletonType4 getInstance() {
        if (instance == null) {
            instance = new SingletonType4();
        }

        return instance;
    }

}

