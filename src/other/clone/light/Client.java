package other.clone.light;

import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        Sheep sheep1=new Sheep("tom",1,"白色");

        Sheep sheep2= (Sheep) sheep1.clone();
        Sheep sheep3= (Sheep) sheep1.clone();
        Sheep sheep4= (Sheep) sheep1.clone();
        Sheep sheep5= (Sheep) sheep1.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);

        Collection e;
    }
}
