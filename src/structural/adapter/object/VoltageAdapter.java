package structural.adapter.object;

public class VoltageAdapter implements IVoltage5{
    // 用聚合而不是继承的方式，扩展性更好
    private Voltage220 v220;

    public VoltageAdapter(Voltage220 v220) {
        this.v220 = v220;
    }

    @Override
    public int output5v() {
        int srcV = v220.output220();

        int targetV = srcV / 44;
        System.out.println("把220伏转为5伏成功");

        return targetV;
    }
}
