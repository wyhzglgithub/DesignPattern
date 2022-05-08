package structural.adapter.object;

public class Phone {
    /**
     * 充电
     */
    public void charging(IVoltage5 iVoltage5){
        if (5 == iVoltage5.output5v()){
            System.out.println("开始给手机充电");
        }else{
            System.out.println("电压不是5伏，不能充电，请检查！");
        }
    }
}
