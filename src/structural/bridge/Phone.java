package structural.bridge;

public abstract class Phone {
    // 组合进颜色
    IColor color;

    public Phone(IColor color) {
        this.color = color;
    }
    // 打电话
    public abstract void call();
}
