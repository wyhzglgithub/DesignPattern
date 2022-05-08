package structural.decorator;

public class Chocolate extends DrinkDecorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("调味品：巧克力");
        setPrice(3.0f);
    }
}
