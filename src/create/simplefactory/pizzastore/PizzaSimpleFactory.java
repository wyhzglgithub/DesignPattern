package create.simplefactory.pizzastore;

import create.simplefactory.pizzastore.pizza.CheesePizza;
import create.simplefactory.pizzastore.pizza.GreekPizza;
import create.simplefactory.pizzastore.pizza.Pizza;

// Pizza的简单工厂类
public class PizzaSimpleFactory {

    // 根据传入的pizza类型，创建对应类型的pizza
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equalsIgnoreCase("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (pizzaType.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }
}
