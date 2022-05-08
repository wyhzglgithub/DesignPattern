package create.singleton.lazy;

public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式单例，线程不安全，实际开发时不能用");

        SingletonType3 instance1 = SingletonType3.getInstance();
        SingletonType3 instance2 = SingletonType3.getInstance();

        System.out.println("instance1.hashcode=" + instance1.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }

}

// 单例（懒汉式，线程不安全）
class SingletonType3 {
    // 0. 设置静态实例对象
    private static SingletonType3 instance;

    // 1. 私有化构造方法，外部不能new
    private SingletonType3() {

    }

    // 2. 在公共方法中实例化对象并返回
    // 问题是，这种写法在多线程环境下是不安全的
    public static SingletonType3 getInstance() {
        if (instance == null) {
            instance = new SingletonType3();
        }

        return instance;
    }

}

