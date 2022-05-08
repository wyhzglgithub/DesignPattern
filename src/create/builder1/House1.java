package create.builder1;

public class House1 {
    // 房屋类型
    private String houseType;
    // 地基
    private String foundation;
    // 墙
    private String wall;
    // 屋顶
    private String roof;

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", foundation='" + foundation + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }


    public static final class House1Builder {
        // 房屋类型
        private String houseType;
        // 地基
        private String foundation;
        // 墙
        private String wall;
        // 屋顶
        private String roof;

        private House1Builder() {
        }

        public static House1Builder aHouse1() {
            return new House1Builder();
        }

        public House1Builder withHouseType(String houseType) {
            this.houseType = houseType;
            return this;
        }

        public House1Builder withFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public House1Builder withWall(String wall) {
            this.wall = wall;
            return this;
        }

        public House1Builder withRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public House1 build() {
            House1 house1 = new House1();
            house1.houseType = this.houseType;
            house1.roof = this.roof;
            house1.wall = this.wall;
            house1.foundation = this.foundation;
            return house1;
        }
    }
}
