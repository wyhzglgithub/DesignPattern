package create.simplefactory.pizzastore.pizza;

public abstract class Pizza {
    protected String name;  // 名字

    // 根据不同的pizza，准备不同的原材料
    public abstract void prepare();

    // 烘焙
    public void bake(){
        System.out.println(name+" baking");
    }

    // 切块
    public void cut(){
        System.out.println(name+"cutting");
    }

    // 装箱
    public void box(){
        System.out.println(name+"boxing");
    }

    public void setName(String name){
        this.name=name;
    }


}
