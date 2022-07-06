public class StringCompare {
  public static void main(String[] args) {
    StringCompare sample = new StringCompare();
    sample.checkString();
    sample.checkCompare();
    sample.checkCompareTo();
  }

  public void checkString() {
    String text = "안녕하세요 스타벅스입니다.";
    System.out.println("text.length() = " + text.length());
    System.out.println("text.isEmpty() = " + text.isEmpty());
  }

  public void checkCompare() {
    String text = "Check value";
    String text2 = "Check value";
    if (text == text2) {
      System.out.println("text == text2 result is same.");
    } else {
      System.out.println("text == text2 result is different. ");
    }
    if (text.equals("Check value")) {
      System.out.println("text.equals(text2) result is same.");
    }
  }

  public void checkCompareTo() {
    String text = "a";
    String text2 = "b";
    String text3 = "c";
    System.out.println(text2.compareTo(text));
    System.out.println(text2.compareTo(text3));
    System.out.println(text.compareTo(text3));
  }
}
