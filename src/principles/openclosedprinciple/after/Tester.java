package principles.openclosedprinciple.after;

public class Tester implements IEmployee {
    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is testing.");
    }
}
