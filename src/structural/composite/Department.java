package structural.composite;

public class Department extends OrganizationComponent{

    public Department(String name, String desc) {
        super(name, desc);
    }


    @Override
    protected void print() {
        // 打印系
        System.out.println(getName());

    }
}
