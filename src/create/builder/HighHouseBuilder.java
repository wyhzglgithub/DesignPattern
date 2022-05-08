package create.builder;

/**
 * 高楼建造者
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void setHouseType() {
        this.house.setHouseType("高楼");
    }

    @Override
    public void buildFoundation() {
        this.house.setFoundation("30米");
        System.out.println("高楼打地基30米");
    }

    @Override
    public void buildWall() {
        this.house.setWall("50厘米");
        System.out.println("高楼砌墙50厘米");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("高楼屋顶");
        System.out.println("高楼盖屋顶");
    }
}
