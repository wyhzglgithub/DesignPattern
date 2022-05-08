package structural.facade;

/**
 * DVD播放器
 */
public class Stereo {
    // 饿汉式单例
    public static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    // 打开
    public void on() {
        System.out.println("打开立体升");
    }
    // 关闭
    public void off(){
        System.out.println("关闭立体声");
    }
    // 播放
    public void play(){
        System.out.println("立体声 正在播放");
    }
    // 暂停
    public void pause(){
        System.out.println("立体声 暂停");
    }

}
