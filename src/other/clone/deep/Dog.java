package other.clone.deep;

import java.io.*;

public class Dog implements Cloneable, Serializable {
    private String name;
    private int age;
    private Cat cat;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cat=" + cat +
                '}';
    }

    /**
     * 深拷贝：方法一，对引用类型单独处拷贝处理
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone()  {
        Dog target = null;

        try {
            target = (Dog)super.clone();

            // 处理引用类型
            target.setCat((Cat) this.getCat().clone());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return target;
    }

    /**
     * 深拷贝：方法二，利用反序列化，优点是引用类型多少也不用单独处理，都一起处理了。
     * @return
     */
    public Dog deepCopy(){
        Dog target = null;

        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;


        try {
            // 把对象序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  // 以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            target = (Dog) ois.readObject();

            return target;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
