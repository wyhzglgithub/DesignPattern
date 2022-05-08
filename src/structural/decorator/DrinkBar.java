package structural.decorator;

public class DrinkBar {
    public static void main(String[] args) {
        // 总目的：点一杯单品咖啡 + 2份巧克力 + 1份牛奶

        // 点一杯Espresso
        Drink order = new Espresso();
        System.out.println("描述：" + order.getDesc());
        System.out.println("费用：" + order.cost());

        // 加1份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDesc());
        System.out.println("费用：" + order.cost());

        // 再加1份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDesc());
        System.out.println("费用：" + order.cost());

        // 再加1份牛奶
        order = new Milk(order);
        System.out.println("描述：" + order.getDesc());
        System.out.println("费用：" + order.cost());

    }
}
