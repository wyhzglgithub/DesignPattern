package behavior.visitor;

public class HardDisk extends HardWare{

    public HardDisk(String command) {
        super(command);
    }

    @Override
    public void accept(UpdateVistor vistor) {
        vistor.updateDisk(this);
    }
}
