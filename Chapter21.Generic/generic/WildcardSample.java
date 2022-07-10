package d.generic;

public class WildcardSample {

  public static void main(String[] args) {
    WildcardSample sample = new WildcardSample();
    sample.callWildcardMethod();
  }

  public void callWildcardMethod() {
    WildCardGeneric<String> wildcard = new WildCardGeneric<String>();
    wildcard.setWildcard("A");
    wildcardStringMethod(wildcard);
  }

  public void wildcardStringMethod(WildCardGeneric<String> c) {
    String value = c.getWildcard();
    System.out.println(value);
  }
}
