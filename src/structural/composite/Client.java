package structural.composite;

public class Client {
    public static void main(String[] args) {
        // 从大到小创建
        // 建大学
        University university = new University("天津大学","天津大学是一所xxx");

        // 建学院
        College c1= new College("天津大学信息学院","天津大学信息学院是一所xxx");
        College c2= new College("天津大学金融学院","天津大学金融学院是一所xxx");

        // 建系
        c1.add(new Department("软件工程","学校计算机软件、软件工程方面知识"));
        c1.add(new Department("网络工程","学习网络设备、网络协议及应用软件的内容"));

        c2.add(new Department("工商管理系","工商管理系"));
        c2.add(new Department("统计系","统计系"));
        c2.add(new Department("会计系","会计系"));

        // 加到大学里
        university.add(c1);
        university.add(c2);

        university.print();

        c1.print();

        c2.print();

    }
}
