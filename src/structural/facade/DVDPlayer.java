package structural.facade;

/**
 * DVD播放器
 */
public class DVDPlayer {
    // 饿汉式单例
    public static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    // 打开
    public void on() {
        System.out.println("打开DVD");
    }
    // 关闭
    public void off(){
        System.out.println("关闭DVD");
    }
    // 播放
    public void play(){
        System.out.println("DVD 正在播放");
    }
    // 暂停
    public void pause(){
        System.out.println("DVD 暂停");
    }

}
