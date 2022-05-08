package structural.proxy;

/**
 * 代理类
 * 实现目标接口
 */
public class SubjectProxy implements Subject {
    private Subject subject;

    public SubjectProxy() {
        try {
            // 把类自动加载，而不是传入，这样就把代理模式和装饰器模式区分开了。
            // 装饰器模式是传入后扩展功能，代理是不要传入，是自动加载的（就不让用户知道还有这个类，要代理他）
            subject=(Subject) this.getClass().getClassLoader().loadClass("structural.proxy.RealSubject").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doWork() {
        System.out.println("在before处可加扩展功能");
        subject.doWork();
        System.out.println("在after处可加扩展功能");
    }
}
