package principles.liskovsubprinciple.after;

public class Bicycle implements NonEnginePoweredVehicle {
    @Override
    public void startVehicle() {
        System.out.println("Bicycle Started!");
    }
}
