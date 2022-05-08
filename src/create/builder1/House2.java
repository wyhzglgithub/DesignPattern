package create.builder1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class House2 {
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

}
