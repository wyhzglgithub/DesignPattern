package structural.bridge;

public class ApplePhone extends Phone{

    public ApplePhone(IColor color) {
        super(color);
    }

    @Override
    public void call() {
        color.useColor();
        System.out.println("苹果手机打电话");
    }
}
