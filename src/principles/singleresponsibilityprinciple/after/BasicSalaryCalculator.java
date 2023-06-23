package principles.singleresponsibilityprinciple.after;

public class BasicSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateBasicSalary(Employee employee) {
        return 5000.0;
    }

    @Override
    public double calculateBonusSalary(Employee employee) {
        return 1000.0;
    }
}
