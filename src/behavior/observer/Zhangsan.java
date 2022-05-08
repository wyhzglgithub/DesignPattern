package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Zhangsan implements Debit{
    // 存放所有借款人
    private List<Credit> allCredits = new ArrayList<Credit>();

    @Override
    public void borrow(Credit credit) {
        allCredits.add(credit); // 添加一个观察者
    }

    @Override
    public void notifyCredit() {
        // 通知所有借款人，还他们钱
        allCredits.forEach(credit -> credit.takeMoney());
    }
}
