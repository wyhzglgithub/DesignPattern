package structural.bridge;

import java.util.ArrayList;

public class PhoneClient {
    public static void main(String[] args) {
        // 构造一个红色的华为手机，并打电话
        HWPhone hwPhone = new HWPhone(new RedColor());
        hwPhone.call();

        // 构造一个黄色的华为手机，并打电话
        MIPhone miPhone = new MIPhone(new YellowColor());
        miPhone.call();

        // 构造一个蓝色的苹果手机，并打电话
        ApplePhone applePhone = new ApplePhone(new BlueColor());
        applePhone.call();

        ArrayList a = new ArrayList();
    }
}
