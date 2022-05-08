package structural.facade;

/**
 * 灯光
 */
public class Lighting {
    // 饿汉式单例
    public static Lighting instance = new Lighting();

    public static Lighting getInstance(){
        return instance;
    }

    // 打开
    public void on() {
        System.out.println("打开灯光");
    }
    // 关闭
    public void off(){
        System.out.println("关闭灯光");
    }
    // 调暗
    public void dim(){
        System.out.println("调暗灯光");
    }
    // 调亮
    public void light(){
        System.out.println("调亮灯光");
    }

}
