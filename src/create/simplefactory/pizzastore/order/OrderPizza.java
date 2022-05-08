package create.simplefactory.pizzastore.order;

import create.simplefactory.pizzastore.PizzaSimpleFactory;
import create.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(PizzaSimpleFactory pizzaSimpleFactory){
        String pizzaType;   // 订购Pizza的类型
        Pizza pizza=null;   // pizza实例

        do {
            // 根据用户输入的pizza类型，创建pizza
            pizzaType = getType();
            pizza = pizzaSimpleFactory.createPizza(pizzaType);

            // 制造pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("创建pizza失败！");
                break;
            }
        }while (true);

    }




    // 得到用户输入的pizza类型
    private String getType() {
        String type="";
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入pizza类型：");
            type = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();

        }

        return type;
    }
}
