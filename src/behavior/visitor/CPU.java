package behavior.visitor;

public class CPU extends HardWare {
    public CPU(String command) {
        super(command);
    }

    @Override
    public void accept(UpdateVistor vistor) {
        vistor.updateCPU(this);
    }
}
