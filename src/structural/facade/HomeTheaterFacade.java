package structural.facade;

/**
 * 家庭影院
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;    // DVD播放器
    private Lighting lighting;  // 灯光
    private Popcorn popcorn;    // 爆米花
    private Projector projector;    // 投影机
    private Screen  screen; // 屏幕
    private Stereo stereo;  // 立体声

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.lighting = Lighting.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    // 下面是操作步骤
    // 准备
    public void ready(){
        dvdPlayer.on();
        lighting.on();
        lighting.light();
        popcorn.on();
        screen.up();
        stereo.on();
    }

    // 播放
    public void play(){
        dvdPlayer.play();
        popcorn.pop();
        stereo.play();
    }

    // 暂停
    public void pause(){
        dvdPlayer.pause();
        stereo.pause();
    }

    // 结束
    public void end(){
        dvdPlayer.off();
        lighting.off();
        popcorn.off();
        screen.down();
        stereo.off();
    }

}
