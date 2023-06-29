package principles.liskovsubprinciple.before;

public class Bicycle implements Vehicle {

    public void startEngine() {
        throw new UnsupportedOperationException("Bicycle doesn't have an engine!");
    }
}
