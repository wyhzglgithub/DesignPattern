package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 在实际中，学院的添加不一定和大学的添加逻辑完全相同
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        // 打印学院
        System.out.println("-------------------"+getName()+"-------------------");
        // 打印系
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }

    }
}
