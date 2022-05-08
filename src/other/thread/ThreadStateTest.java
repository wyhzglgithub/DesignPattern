package other.thread;

public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            System.out.println("开始");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束");
        });

        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        Thread.sleep(4000);
        System.out.println(a.getState());
    }
}
