package behavior.observer;

/**
 * 贷款方接口
 */
public interface Debit {
    /**
     * 借款
     * @param credit
     */
    void borrow(Credit credit);

    /**
     * 通知借款方
     */
    void notifyCredit();
}
