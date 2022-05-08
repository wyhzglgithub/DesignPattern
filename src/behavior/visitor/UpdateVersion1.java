package behavior.visitor;

/**
 * 升级包Version1
 */
public class UpdateVersion1 implements UpdateVistor{
    @Override
    public void updateCPU(CPU cpu) {
        cpu.command +="; 1+1=2";
    }

    @Override
    public void updateDisk(HardDisk disk) {
        disk.command+="; 记住1+1=2";
    }
}
