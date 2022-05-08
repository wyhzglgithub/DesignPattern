package create.builder;

public class HouseDirector {
    // 房屋建造者
    private HouseBuilder hb;

    public HouseDirector(HouseBuilder hb) {
        this.hb = hb;
    }

    public HouseBuilder getHb() {
        return hb;
    }

    public void setHb(HouseBuilder hb) {
        this.hb = hb;
    }

    /**
     * 按Director的建造步骤来建造房屋
     * @return
     */
    public House buildHouse(){
        return this.hb.buildOver();
    }
}
