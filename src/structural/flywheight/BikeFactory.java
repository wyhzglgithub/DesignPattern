package structural.flywheight;

import java.util.HashSet;
import java.util.Set;

public class BikeFactory {
    // 饿汉式得到单例
    private static BikeFactory instance=new BikeFactory();

    // 自行车池
    private static Set<Bike> pool=new HashSet<Bike>();

    /**
     * 私有化构造方法，不让new
     */
    private BikeFactory() {
    }

    public static BikeFactory getInstance(){
        return instance;
    }

    // 完成池填充
    static {
        for (int i=1;i<4;i++){
            pool.add(new DiDiBike(i));
        }
    }

    // 得到自行车
    public Bike getBike(){
        for (Bike bike:pool) {
            if (bike.getState()==0){
                return bike;
            }
        }

        return null;
    }
}
