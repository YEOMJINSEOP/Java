package d.generic;

public class GenericWildcardSample {
  public static void main(String[] args) {
    GenericWildcardSample sample = new GenericWildcardSample();
    sample.callGenericMethod();
  }

  public <T> void genericMethod(WildCardGeneric<T> c, T addValue) {
    c.setWildcard(addValue);
    T value = c.getWildcard();
    System.out.println(value);
  }

  public void callGenericMethod() {
    WildCardGeneric<String> wildcard = new WildCardGeneric<String>();
    genericMethod(wildcard, "Data");
  }
}
