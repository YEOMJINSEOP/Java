package d.lang.practice;

public class NumberObjects {

  public static void main(String[] args) {
    NumberObjects sample = new NumberObjects();

    sample.parseLong("r1024");
    sample.parseLong("1024");
    sample.printOtherBase(1024);
  }

  public long parseLong(String data) {
    try {
      long result = Long.parseLong(data);
      System.out.println(data);
    } catch (NumberFormatException e) {
      System.out.println(data + "is not a number");
    } catch (Exception e) {

    }
    return -1;
  }

  public void printOtherBase(long value) {
    System.out.println("Original : " + value);
    System.out.println("Binary : " + Long.toBinaryString(value));
    System.out.println("Hex : " + Long.toHexString(value));
    System.out.println("Octal : " + Long.toOctalString(value));
  }
}
