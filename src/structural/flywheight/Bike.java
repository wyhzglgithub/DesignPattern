package structural.flywheight;

public abstract class Bike {
    /**
     * 骑行状态：0 未骑行；1  骑行中
     * 是内部状态
     */
    protected Integer state = 0;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 骑行
     * @param userName 骑行人，传入的是外部状态
     */
    abstract void ride(String userName);

    /**
     * 归还
     */
    abstract void back();
}
