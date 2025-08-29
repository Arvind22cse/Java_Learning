package Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerating");
    }
}
