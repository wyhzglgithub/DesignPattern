package structural.facade;

/**
 * 爆米花机
 */
public class Popcorn {
    // 饿汉式单例
    public static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    // 打开
    public void on() {
        System.out.println("打开爆米花机");
    }

    // 关闭
    public void off() {
        System.out.println("关闭爆米花机");
    }

    // 爆米花
    public void pop() {
        System.out.println("正在爆米花");
    }

}
