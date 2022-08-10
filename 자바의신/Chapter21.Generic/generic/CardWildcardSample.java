package d.generic;

public class CardWildcardSample {
  public static void main(String[] args) {
    CardWildcardSample sample = new CardWildcardSample();
    sample.callBoundedWildcardMethod();
    sample.callBusBoundedWildcardMethod();
  }

  public void callBoundedWildcardMethod() {
    WildCardGeneric<Car> wildcard = new WildCardGeneric<Car>();
    wildcard.setWildcard(new Car("Mustang"));
    boundedWildcardMethod(wildcard);
  }

  public void callBusBoundedWildcardMethod() {
    WildCardGeneric<Bus> wildcard = new WildCardGeneric<Bus>();
    wildcard.setWildcard(new Bus("6900"));
    boundedWildcardMethod(wildcard);
  }

  public void boundedWildcardMethod(WildCardGeneric<? extends Car> c) {
    Car value = c.getWildcard();
    System.out.println(value);
  }
}
