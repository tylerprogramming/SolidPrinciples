package principles.openclosedprinciple.after;

public class ScrumMaster implements IEmployee {
    private String name;

    public ScrumMaster(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is scrumming.");
    }
}
