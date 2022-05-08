package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        // 打印大学
        System.out.println("-------------------"+getName()+"-------------------");
        // 打印学院
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }

    }
}
