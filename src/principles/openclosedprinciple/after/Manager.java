package principles.openclosedprinciple.after;

public class Manager implements IEmployee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is managing.");
    }
}
