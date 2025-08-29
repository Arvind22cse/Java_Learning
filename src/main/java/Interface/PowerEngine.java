package Interface;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerating");
    }
}
