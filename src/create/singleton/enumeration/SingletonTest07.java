package create.singleton.enumeration;

public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("用枚举实现单例，兼顾多线程和性能，推荐使用！");

        SingletonType7 instance1= SingletonType7.INSTANCE;
        SingletonType7 instance2= SingletonType7.INSTANCE;

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        instance1.sayOK();

    }


}

enum SingletonType7{
    INSTANCE;

    public void sayOK(){
        System.out.println("Hello！");
    }

}
