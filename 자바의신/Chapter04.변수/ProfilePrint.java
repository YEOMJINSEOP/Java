public class ProfilePrint {
  byte age;
  String name;
  boolean isMarried;

  public void setAge(byte age) {
    this.age = age;
  }

  public byte getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setMarried(boolean flag) {
    this.isMarried = flag;
  }

  public boolean isMarried() {
    return this.isMarried;
  }

  public static void main(String[] args) {
    ProfilePrint Liam = new ProfilePrint();
    Liam.setName("Liam");
    Liam.setAge((byte) 24);
    Liam.setMarried(false);
    System.out.println(Liam.getName());
    System.out.println(Liam.getAge());
    System.out.println(Liam.isMarried());
  }
}
