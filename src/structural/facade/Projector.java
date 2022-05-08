package structural.facade;

/**
 * 投影仪
 */
public class Projector {
    // 饿汉式单例
    public static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    // 打开
    public void on() {
        System.out.println("打开投影仪");
    }

    // 关闭
    public void off() {
        System.out.println("关闭投影仪");
    }

    // 投影
    public void pop() {
        System.out.println("正在投影");
    }
    // 暂停
    public void pause(){
        System.out.println("投影 暂停");
    }
    // 聚焦
    public void focus(){
        System.out.println("投影 聚焦");
    }


}
