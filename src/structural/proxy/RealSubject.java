package structural.proxy;

public class RealSubject implements Subject {
    @Override
    public void doWork() {
        System.out.println("实际执行");
    }
}
