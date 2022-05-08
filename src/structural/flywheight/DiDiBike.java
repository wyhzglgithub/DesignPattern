package structural.flywheight;

public class DiDiBike extends Bike {
    /**
     * 车架号，是内部状态
     */
    private Integer bikeId;

    public DiDiBike(Integer bikeId) {
        this.bikeId = bikeId;
    }

    public Integer getBikeId() {
        return bikeId;
    }

    public void setBikeId(Integer bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    void ride(String userName) {
        state=1;
        System.out.println(userName+" 正在骑Id="+bikeId+"号的滴滴单车。");
    }

    @Override
    void back() {
        state=0;
    }
}
