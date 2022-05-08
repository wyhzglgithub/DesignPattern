package behavior.visitor;

/**
 * 硬件接口
 * 接收指令、运行指令、接受升级
 */
public abstract class HardWare {
    public String command;

    public HardWare(String command) {
        this.command = command;
    }

    public void run(){
        System.out.println(command);
    }

    public abstract void accept(UpdateVistor vistor);
}
