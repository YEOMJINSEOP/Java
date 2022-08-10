public class Profile {
  String name;
  int age;

  public void setName(String str) {
    this.name = str;
  }

  public void setAge(int val) {
    this.age = val;
  }

  public void printName() {
    System.out.println("My name is " + name);
  }

  public void printAge() {
    System.out.println("My age is " + age);
  }
}
