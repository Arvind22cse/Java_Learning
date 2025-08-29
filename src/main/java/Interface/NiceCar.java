package Interface;

public class NiceCar {
    private Engine engine;
    private Media media=new CDPlayer();
    public NiceCar(){
        this.engine=new PowerEngine();
    }
    public void startengine(){
        engine.start();
    }
    public void stopengine(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }


}
