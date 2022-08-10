public class Calculator {
  public static int add(int num1, int num2) {
    int sum;
    sum = num1 + num2;
    System.out.println(sum);
    return sum;
  }

  public static int deduct(int num1, int num2) {
    int result;
    result = num1 - num2;
    System.out.println(result);
    return result;
  }

  public static int multiply(int num1, int num2) {
    int result;
    result = num1 * num2;
    System.out.println(result);
    return result;
  }

  public static int divide(int num1, int num2) {
    int result;
    result = num1 / num2;
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
    add(1, 2);
    deduct(6, 3);
    multiply(2, 3);
    divide(9, 3);
  }
}
