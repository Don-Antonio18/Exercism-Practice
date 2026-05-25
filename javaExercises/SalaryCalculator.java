public class SalaryCalculator {
    double baseSalary = 1000.00;

    public double salaryMultiplier(int daysSkipped) {
        // 15% penalty if employee skips at leaast 5 days
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        // Multiplier = 13 if employee spends >= 20 products
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        // Salary should not exceed 2000
        return finalSalary >= 2000 ? 2000: finalSalary;
    }
}
