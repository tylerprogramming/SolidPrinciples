package principles.singleresponsibilityprinciple.after;

public class PayrollFacade {
    private SalaryCalculator salaryCalculator;
    private EmailService emailService;

    public PayrollFacade() {
        this.salaryCalculator = new BasicSalaryCalculator();
        this.emailService = new BasicEmailService();
    }

    public void calculateAndSendSalary(Employee employee) {
        double basicSalary = salaryCalculator.calculateBasicSalary(employee);
        double bonusSalary = salaryCalculator.calculateBonusSalary(employee);
        double totalSalary = basicSalary + bonusSalary;

        emailService.sendSalaryEmail(employee, totalSalary);
    }
}
