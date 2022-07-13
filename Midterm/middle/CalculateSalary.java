package godOfJava.c.middle;

public class CalculateSalary {
  public static void main(String[] args) {
    CalculateSalary calSal = new CalculateSalary();
    calSal.calculateSalaries();
  }

  public long getSalaryIncrease(Employee employee) {
    int type = employee.getType();
    long salary = employee.getSalary();
    double increaseRate = 0;
    switch (type) {
      case 1:
        increaseRate = 0.05;
        break;

      case 2:
        increaseRate = 1.1;
        break;

      case 3:
        increaseRate = 1.2;
        break;

      case 4:
        increaseRate = 1.3;
        break;

      case 5:
        increaseRate = 2;
        break;
    }

    double increasedSalary = (double) salary * increaseRate;
    return (long) increasedSalary;
  }

  public void calculateSalaries() {
    Employee[] sample = new Employee[5];
    sample[0] = new Employee("LeeDaeRi", 1, 1000000000);
    sample[1] = new Employee("KimManager", 2, 100000000);
    sample[2] = new Employee("WhanDesign", 3, 70000000);
    sample[3] = new Employee("ParkArchi", 4, 80000000);
    sample[4] = new Employee("LeeDevelop", 5, 60000000);

    for (Employee employee : sample) {
      long increasedSalary = getSalaryIncrease(employee);
      String employeeName = employee.getName();
      System.out.println(employeeName + "=" + increasedSalary);
    }
  }
}