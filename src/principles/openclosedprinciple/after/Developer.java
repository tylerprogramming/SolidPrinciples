package principles.openclosedprinciple.after;

public class Developer implements IEmployee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is coding.");
    }
}
