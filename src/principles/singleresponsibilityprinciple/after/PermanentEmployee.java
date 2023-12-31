package principles.singleresponsibilityprinciple.after;

public class PermanentEmployee implements Employee {
    private String name;
    private int id;

    public PermanentEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
