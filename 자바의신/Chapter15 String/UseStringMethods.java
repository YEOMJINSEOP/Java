public class UseStringMethods {
  public static void main(String[] args) {
    UseStringMethods sample = new UseStringMethods();
    String sentence = "The String class represents character strings.";
    sample.printWords(sentence);
    sample.findString(sentence, "string");
    sample.findAnyCaseString(sentence, "string");
    sample.countChar(sentence, 's');
    sample.printContainWords(sentence, "ss");
  }

  public void printWords(String str) {
    String splitArray[] = str.split(" ");
    for (String value : splitArray) {
      System.out.println(value);
    }
  }

  public void findString(String str, String findStr) {
    int index = str.indexOf(findStr);
    System.out.println(index);
  }

  public void findAnyCaseString(String str, String findStr) {
    String strLower = str.toLowerCase();
    String findStrLower = findStr.toLowerCase();
    int index = strLower.indexOf(findStrLower);
    System.out.println(index);
  }

  public void countChar(String str, char c) {
    char array[] = str.toCharArray();
    int count = 0;
    for (char temp : array) {
      if (temp == c) {
        count++;
      }
    }
    System.out.println(count);
  }

  public void printContainWords(String str, String findStr) {
    String strSplit[] = str.split(" ");
    for (String temp : strSplit) {
      if (temp.contains(findStr)) {
        System.out.println(temp + " contains " + findStr);
      }
    }
  }

}
