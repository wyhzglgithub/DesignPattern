package structural.decorator;

public class SoybeanMilk extends DrinkDecorator{
    public SoybeanMilk(Drink drink) {
        super(drink);
        setDesc("调味品：豆浆");
        setPrice(2.0f);
    }
}
