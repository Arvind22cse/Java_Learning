package Interface;

public class Main {
    public static void main(String[] args) {
//        Car obj=new Car();
//        obj.brake();
//        obj.start();
//        obj.stop();
//        obj.acc();
        NiceCar nc=new NiceCar();
        nc.startengine();
        nc.stopengine();
        nc.startMusic();
        nc.stopMusic();
        nc.upgradeEngine();
        nc.startengine();
    }
}
