package behavior.visitor;

/**
 * 二蛋机器人
 * 有硬件
 */
public class EggRobot {
    private CPU cpu;
    private HardDisk disk;

    public EggRobot() {
        this.cpu = new CPU("1+1=1");
        this.disk = new HardDisk("记住：1+1=1");
    }

    public void cale(){
        cpu.run();
        disk.run();
    }

    public void accept(UpdateVistor vistor){
        cpu.accept(vistor);
        disk.accept(vistor);
    }
}
