package create.builder;

public class HouseClient {
    public static void main(String[] args) {
        // 建造普通房屋
        HouseDirector hd1=new HouseDirector(new CommonHouseBuilder());
        hd1.buildHouse();

        // 建造高楼
        HouseDirector hd2=new HouseDirector(new HighHouseBuilder());
        hd2.buildHouse();

        // 建造别墅
        HouseDirector hd3=new HouseDirector(new VillaHouseBuilder());
        hd3.buildHouse();

    }
}
