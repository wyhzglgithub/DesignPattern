package create.singleton.hungry;

public class SingletonTest02 {

    public static void main(String[] args) {

        // 测试
        SingletonType2 instance1 = SingletonType2.getInstance();
        SingletonType2 instance2 = SingletonType2.getInstance();


        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println(instance1 == instance2);

    }


}

// 饿汉式（静态代码块）

class SingletonType2 {
    // 0. 声明静态实例
    private static SingletonType2 instance;

    // 1. 构造器私有化，外部不能new
    private SingletonType2() {

    }

    // 2. 在静态代码块中创建实例
    static {
        instance = new SingletonType2();
    }

    // 3. 提供公共静态方法，返回实例对象
    public static SingletonType2 getInstance() {
        return instance;
    }
}

