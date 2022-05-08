package create.builder;

public class House {
    // 房屋类型
    private String houseType;
    // 地基
    private String foundation;
    // 墙
    private String wall;
    // 屋顶
    private String roof;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", foundation='" + foundation + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
