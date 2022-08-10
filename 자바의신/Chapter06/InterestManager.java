public class InterestManager {
  public static void main(String[] args) {
    InterestManager Liam = new InterestManager();
    for (int day = 1; day <= 365; day++) {
      if (day % 10 != 1)
        continue;
      System.out.println("day" + day + ":" + Liam.getInterestRate(day));
    }
  }

  public double getInterestRate(int day) {
    if (day < 91) {
      return 0.005;
    } else if (day < 181) {
      return 0.01;
    } else if (day < 365) {
      return 0.02;
    } else {
      return 0.056;
    }
  }

  public double calculateAmount(int day, long amount) {
    double interestRate = getInterestRate(day);
    double sum = amount + (interestRate * amount);
    return sum;
  }
}
