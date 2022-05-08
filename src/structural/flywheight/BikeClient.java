package structural.flywheight;

public class BikeClient {
    public static void main(String[] args) {
        Bike bike1=BikeFactory.getInstance().getBike();
        if (bike1 != null){
            bike1.ride("张三");
        }

        Bike bike2=BikeFactory.getInstance().getBike();
        if (bike2 != null){
            bike2.ride("李四");
        }

        Bike bike3=BikeFactory.getInstance().getBike();
        if (bike3 != null){
            bike3.ride("王五");
            bike3.back();
        }

        Bike bike4=BikeFactory.getInstance().getBike();
        if (bike4 != null){
            bike4.ride("赵六");
            bike4.back();
        }
    }
}
