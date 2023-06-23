import principles.singleresponsibilityprinciple.before.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tyler", 12345, 1000, 2000);
        employee.calculateSalary();
    }
}