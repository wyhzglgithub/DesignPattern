package create.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在为希腊披萨准备原材料");
    }
}
