public class SalaryManager {

  public static void main(String[] args) {
    SalaryManager Liam = new SalaryManager();
    Liam.getMonthlySalary(20000000);
  }

  public double getMonthlySalary(int yearlySalary) {
    double monthSalary = yearlySalary / 12.0;
    double tax = calculateTax(monthSalary);
    double pension = calculateNationalPension(monthSalary);
    double healthInsurance = calculateHealthInsurance(monthSalary);
    double deductSum = tax + pension + healthInsurance;
    monthSalary -= deductSum;
    System.out.println(monthSalary);
    return monthSalary;
  }

  public double calculateTax(double monthSalary) {
    double tax = monthSalary * 0.125;
    System.out.println(tax);
    return tax;
  }

  public double calculateNationalPension(double monthSalary) {
    double pension = monthSalary * 0.081;
    System.out.println(pension);
    return pension;
  }

  public double calculateHealthInsurance(double monthSalary) {
    double healthInsurance = monthSalary * 0.135;
    System.out.println(healthInsurance);
    return healthInsurance;
  }

}