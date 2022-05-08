package structural.composite;

public abstract class OrganizationComponent {
    // 组织名称
    private String name;
    // 组织描述
    private String desc;

    // 默认增加实现
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    // 默认删除实现
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // 打印
    protected abstract void print();
}
