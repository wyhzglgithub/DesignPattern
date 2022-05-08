package create.builder;

/**
 * 抽象的房屋建造者
 * 把房屋本身和建造过程分开，在建造过程中赋予房屋不同的属性，进而达到建造不同房屋的目的
 */
public abstract class HouseBuilder {
    // 最终要建的房屋
    protected House house = new House();

    // 设置房屋类型
    public abstract void setHouseType();

    // 建地基
    public abstract void buildFoundation();

    // 建墙
    public abstract void buildWall();

    // 建屋顶
    public abstract void buildRoof();

    // 房屋建造完成并返回
    public House buildOver() {
        setHouseType();
        buildFoundation();
        buildWall();
        buildRoof();
        System.out.println(house.getHouseType() + "建造完成！");
        System.out.println(house);
        System.out.println("");

        return house;
    }
}
