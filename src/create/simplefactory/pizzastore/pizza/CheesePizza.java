package create.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在为奶酪披萨准备原材料");
    }
}
