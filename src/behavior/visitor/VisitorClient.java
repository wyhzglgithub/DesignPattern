package behavior.visitor;

public class VisitorClient {
    public static void main(String[] args) {
        EggRobot eggRobot = new EggRobot();
        eggRobot.cale();

        UpdateVistor vistor = new UpdateVersion1();
        eggRobot.accept(vistor);
        eggRobot.cale();

    }
}
