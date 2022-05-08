package behavior.visitor;

/**
 * 升级包接口
 * 在硬件不动的基础上，可对机器人完成软件升级
 */
public interface UpdateVistor {
    public void updateCPU(CPU cpu);
    public void updateDisk(HardDisk disk);
}
