package structural.bridge;

public class MIPhone extends Phone{

    public MIPhone(IColor color) {
        super(color);
    }

    @Override
    public void call() {
        color.useColor();
        System.out.println("小米手机打电话");
    }
}
