package create.singleton.lazy;

public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懒汉式单例，是线程安全，效率高，推荐使用");

        SingletonType5 instance1 = SingletonType5.getInstance();
        SingletonType5 instance2 = SingletonType5.getInstance();

        System.out.println("instance1.hashcode=" + instance1.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }

}

// 单例（懒汉式，线程安全）
class SingletonType5 {
    // 0. 设置静态实例对象
    // volatile是轻量级的synchronized
    private static volatile SingletonType5 instance;

    // 1. 私有化构造方法，外部不能new
    private SingletonType5() {

    }

    // 2. 在公共方法中实例化对象并返回
    public static SingletonType5 getInstance() {
        if (instance == null) {
            synchronized (SingletonType5.class) {
                if (instance == null) { // 双重判断避免创建多个
                    instance = new SingletonType5();
                }
            }
        }

        return instance;
    }

}

