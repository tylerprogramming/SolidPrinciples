package principles.singleresponsibilityprinciple.after;

public interface SalaryCalculator {
    double calculateBasicSalary(Employee employee);
    double calculateBonusSalary(Employee employee);
}
