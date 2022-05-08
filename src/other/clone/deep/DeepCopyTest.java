package other.clone.deep;

public class DeepCopyTest {
    public static void main(String[] args) {
        Dog dog1=new Dog("小黄狗",2);
        dog1.setCat(new Cat("小花猫",1,"白色"));

        // 深拷贝方法一：clone
        Dog dog2= (Dog) dog1.clone();
        Dog dog3= (Dog) dog1.clone();
        Dog dog4= (Dog) dog1.clone();
        Dog dog5= (Dog) dog1.clone();

        System.out.println("深拷贝方法一：clone");
        System.out.println(dog1.toString() + ", cat.hashcode"+ dog1.getCat().hashCode());
        System.out.println(dog2.toString() + ", cat.hashcode"+ dog2.getCat().hashCode());
        System.out.println(dog3.toString() + ", cat.hashcode"+ dog3.getCat().hashCode());
        System.out.println(dog4.toString() + ", cat.hashcode"+ dog4.getCat().hashCode());
        System.out.println(dog5.toString() + ", cat.hashcode"+ dog5.getCat().hashCode());

        // 深拷贝方法二：序列化
        Dog dog22= (Dog) dog1.deepCopy();
        Dog dog33= (Dog) dog1.deepCopy();
        Dog dog44= (Dog) dog1.deepCopy();
        Dog dog55= (Dog) dog1.deepCopy();

        System.out.println("深拷贝方法二：序列化");
        System.out.println(dog1.toString() + ", cat.hashcode"+ dog1.getCat().hashCode());
        System.out.println(dog22.toString() + ", cat.hashcode"+ dog22.getCat().hashCode());
        System.out.println(dog33.toString() + ", cat.hashcode"+ dog33.getCat().hashCode());
        System.out.println(dog44.toString() + ", cat.hashcode"+ dog44.getCat().hashCode());
        System.out.println(dog55.toString() + ", cat.hashcode"+ dog55.getCat().hashCode());

    }

}
