package other.staticinnerclass;

public class Client {
    public static void main(String[] args) {
        // 只加载外部类，不会加载内部类
        OutClass out = new OutClass();

        // 访问内部类
        out.new InnerClass();

        // 访问静态内部类中的静态变量
        System.out.println(OutClass.StaticInnerClass.STATIC_INNER_DATE);

        // 访问静态内部类中的静态方法
        OutClass.StaticInnerClass.getOne();
    }

}
