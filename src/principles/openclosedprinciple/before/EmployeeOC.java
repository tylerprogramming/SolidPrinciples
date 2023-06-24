package principles.openclosedprinciple.before;

class EmployeeOC {
    private String name;
    private String role;

    public EmployeeOC(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void performDuties() {
        if (role.equals("Developer")) {
            System.out.println(name + " is coding.");
        } else if (role.equals("Manager")) {
            System.out.println(name + " is managing.");
        } else if (role.equals("Tester")) {
            System.out.println(name + " is testing.");
        } else if (role.equals("Scrum Master")) {
            System.out.println(name + " is scrumming.");
        }
        // Adding new roles requires modifying this class
    }
}