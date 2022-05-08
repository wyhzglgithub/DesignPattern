package structural.facade;

/**
 * 屏幕
 */
public class Screen {
    // 饿汉式单例
    public static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    // 向上升屏幕
    public void up() {
        System.out.println("屏幕上升");
    }

    // 向下降屏幕
    public void down() {
        System.out.println("屏幕下降");
    }

}
