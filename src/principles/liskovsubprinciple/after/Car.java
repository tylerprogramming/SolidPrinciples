package principles.liskovsubprinciple.after;

public class Car implements EnginePoweredVehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car!");
    }
}
