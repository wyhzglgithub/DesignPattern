package structural.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade();

        System.out.println("-------准备-------");
        homeTheaterFacade.ready();
        System.out.println("-------播放-------");
        homeTheaterFacade.play();
        System.out.println("-------暂停-------");
        homeTheaterFacade.pause();
        System.out.println("-------关闭-------");
        homeTheaterFacade.end();
    }
}
