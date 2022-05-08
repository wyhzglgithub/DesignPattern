package create.singleton.hungry;

/**
 * 饿汉式
 *
 * 优点：
 * 1、不管是静态变量方式，还是静态代码块，都可以保证只有一个实例，也是线程安全的（使用的是classloader机制保证的线程安全）。
 * 2、如果资源充足的情况下，是可用的。
 *
 * 缺点
 * 1、因为是类加载时就实例化了，如果该实例没人用，则会造成资源浪费。
 */
public class SingletonTest01 {

    public static void main(String[] args) {

        // 测试
        SingletonType1 instance1 = SingletonType1.getInstance();
        SingletonType1 instance2 = SingletonType1.getInstance();


        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println(instance1 == instance2);

    }


}

// 饿汉式（静态变量）

class SingletonType1 {

    // 1. 构造器私有化，外部不能new
    private SingletonType1() {

    }

    // 2. 本例内部创建实例
    private final static SingletonType1 instance = new SingletonType1();

    // 3. 提供公共静态方法，返回实例对象
    public static SingletonType1 getInstance() {
        return instance;
    }
}

