package principles.singleresponsibilityprinciple.after;

public class BasicEmailService implements EmailService {
    @Override
    public void sendSalaryEmail(Employee employee, double totalSalary) {
        System.out.println("Email sent to " + employee.getName() + " (ID: " + employee.getId() + ")");
        System.out.println("Total Salary: $" + totalSalary);
    }
}
