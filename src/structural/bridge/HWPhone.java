package structural.bridge;

public class HWPhone extends Phone{

    public HWPhone(IColor color) {
        super(color);
    }

    @Override
    public void call() {
        color.useColor();
        System.out.println("华为手机打电话");
    }
}
