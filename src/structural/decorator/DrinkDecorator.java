package structural.decorator;

/**
 * 装饰者
 */
public class DrinkDecorator extends Drink {
    // 被装饰者：饮料
    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 自己的价格+饮料的价格
        return this.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getPrice() + " && " + drink.getDesc() + drink.getPrice();
    }
}
