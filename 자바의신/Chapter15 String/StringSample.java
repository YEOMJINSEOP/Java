public class StringSample {
  public static void main(String[] args) {
    StringSample sample = new StringSample();
    sample.convertUTF16();
  }

  public void printByteArray(byte[] array) {
    for (byte data : array) {
      System.out.print(data + " ");
    }
    System.out.println();
  }

  public void convertUTF16() {
    try {
      String korean = "염진섭";
      byte[] array2 = korean.getBytes("UTF-16");
      printByteArray(array2);

      String korean2 = new String(array2, "UTF-16");
      System.out.println(korean2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void convert() {
    try {
      String korean = "한글";
      byte[] array1 = korean.getBytes();
      printByteArray(array1);
      System.out.println();
      String korean2 = new String(array1);
      System.out.println(korean2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
