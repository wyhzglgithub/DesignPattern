package other.staticinnerclass;

/**
 * 外部类里加内部类和静态内部类
 */
public class OutClass {
    // 静态变量
    public static long OUT_DATE = System.currentTimeMillis();

    // 静态代码块
    static {
        System.out.println("OutClass静态块加载时间："+System.currentTimeMillis());
    }

    // 构造方法
    public OutClass() {
        System.out.println("OutClass构造方法加载时间："+System.currentTimeMillis());
    }

    // 内部类
    class InnerClass{
        public InnerClass() {
            System.out.println("InnerClass构造方法加载时间："+System.currentTimeMillis());
        }
    }

    // 静态内部类
    static class StaticInnerClass{
        // 静态变量
        public static long STATIC_INNER_DATE = System.currentTimeMillis();

        // 静态代码块
        static {
            System.out.println("StaticInnerClass静态块加载时间："+System.currentTimeMillis());
        }

        public StaticInnerClass() {
            System.out.println("StaticInnerClass构造方法加载时间："+System.currentTimeMillis());
        }

        public static void getOne(){
            System.out.println("StaticInnerClass中的getOne方法加载时间："+System.currentTimeMillis());
        }
    }
}
