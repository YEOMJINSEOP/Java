package godOfJava.c.middle;

public class Employee {
  String name;
  int type;
  long salary;

  public Employee(String name, int type, long salary) {
    this.setName(name);
    this.setType(type);
    this.setSalary(salary);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(int type) {
    this.type = type;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getType() {
    return type;
  }

  public long getSalary() {
    return salary;
  }
}
