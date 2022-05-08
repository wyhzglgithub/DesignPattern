package behavior.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Debit debit = new Zhangsan();
        debit.borrow(new Lisi());
        debit.borrow(new Wangwu());
        debit.borrow(new Zhaoliu());

        debit.notifyCredit();
    }
}
