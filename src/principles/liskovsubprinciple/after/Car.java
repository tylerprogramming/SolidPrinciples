package principles.liskovsubprinciple.after;

public class Car implements EnginePoweredVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started!");
    }
}
