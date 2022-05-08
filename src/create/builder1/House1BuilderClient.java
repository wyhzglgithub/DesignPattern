package create.builder1;

public class House1BuilderClient {
    public static void main(String[] args) {
        House1 a = House1.House1Builder.aHouse1().withHouseType("普通房屋").withFoundation("打3米地基").withWall("垒20cm的墙").withRoof("盖10cm的屋顶").build();

        System.out.println(a.toString());
    }
}
