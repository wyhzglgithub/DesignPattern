package structural.decorator;

public class Milk extends DrinkDecorator{
    public Milk(Drink drink) {
        super(drink);
        setDesc("调味品：牛奶");
        setPrice(2.0f);
    }
}
