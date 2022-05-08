package create.builder1;

public class House2BuilderClient {
    public static void main(String[] args) {
        House2 a = House2.builder().houseType("高楼").foundation("打20米地基").wall("垒40里面厚的墙").roof("盖30厘米的屋顶").build();

        System.out.println(a.toString());
    }
}
