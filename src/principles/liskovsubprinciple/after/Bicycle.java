package principles.liskovsubprinciple.after;

public class Bicycle implements NonEnginePoweredVehicle {
    @Override
    public void startVehicle() {
        System.out.println("Starting the bike without an engine!");
    }
}
