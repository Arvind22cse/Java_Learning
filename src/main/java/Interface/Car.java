package Interface;

public class Car implements Brake,Engine{

    @Override
    public void brake() {
        System.out.println("Brake hit");
    }

    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");
    }

    @Override
    public void acc() {
        System.out.println("car is accelerating");
    }



}
