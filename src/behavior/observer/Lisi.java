package behavior.observer;

public class Lisi implements Credit{
    @Override
    public void takeMoney() {
        System.out.println("李四要钱");
    }
}
