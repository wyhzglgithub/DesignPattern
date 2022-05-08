package create.builder;

/**
 * 别墅建造者
 */
public class VillaHouseBuilder extends HouseBuilder {
    @Override
    public void setHouseType() {
        this.house.setHouseType("别墅");
    }

    @Override
    public void buildFoundation() {
        this.house.setFoundation("10米");
        System.out.println("别墅打地基10米");
    }

    @Override
    public void buildWall() {
        this.house.setWall("30厘米");
        System.out.println("别墅砌墙30厘米");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("别墅屋顶");
        System.out.println("别墅盖屋顶");
    }
}
