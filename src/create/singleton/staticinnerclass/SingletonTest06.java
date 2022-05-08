package create.singleton.staticinnerclass;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("静态内部类完成懒汉式、线程安全的单例，兼顾内存和效率，推荐使用");

        SingletonType6 instance1 = SingletonType6.getInstance();
        SingletonType6 instance2 = SingletonType6.getInstance();

        System.out.println("instance1.hashcode=" + instance1.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());

    }
}

class SingletonType6 {
    // 1. 私有化构造方法，外部不能new
    private SingletonType6() {

    }

    // 2. 静态内部类，完成懒加载、线程安全的单例实例化
    // 原理：静态类只加载一次，加载时JVM保证线程安全
    private static class SingletonType6Instance {
        private static final SingletonType6 instance = new SingletonType6();
    }

    // 3. 提供外部调用
    public static SingletonType6 getInstance() {
        return SingletonType6Instance.instance;
    }

}

