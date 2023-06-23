package principles.singleresponsibilityprinciple.before;

public class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double bonusSalary;

    public Employee(String name, int id, double basicSalary, double bonusSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
    }

    public void calculateSalary() {
        double totalSalary = basicSalary + bonusSalary;

        sendSalaryEmail(totalSalary);
    }

    private void sendSalaryEmail(double totalSalary) {
        System.out.println("Email sent to " + name + " (ID: " + id + ")");
        System.out.println("Total Salary: $" + totalSalary);
    }
}