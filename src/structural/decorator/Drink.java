package structural.decorator;

/**
 * 饮料抽象类
 */
public abstract class Drink {
    // 描述
    private String desc;
    // 价格
    private float price=0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用，由子类实现
    public abstract float cost();
}
