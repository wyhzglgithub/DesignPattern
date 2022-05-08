package create.builder;

/**
 * 普通房屋建造者
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void setHouseType() {
        this.house.setHouseType("普通房屋");
    }

    @Override
    public void buildFoundation() {
        this.house.setFoundation("5米");
        System.out.println("普通房屋打地基5米");
    }

    @Override
    public void buildWall() {
        this.house.setWall("20厘米");
        System.out.println("普通房屋砌墙20厘米");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("普通屋顶");
        System.out.println("普通房屋盖屋顶");
    }
}
