package d.collection.practice;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
  public static void main(String[] args) {
    RandomNumberMaker sample = new RandomNumberMaker();
    for (int i = 0; i < 10; i++) {
      sample.getSixNumber();
    }
  }

  public HashSet<Integer> getSixNumber() {
    Random random = new Random();
    HashSet<Integer> numSet = new HashSet<Integer>();

    while (numSet.size() < 6) {
      int tempNumber = random.nextInt(45);
      numSet.add(tempNumber);
    }
    System.out.println(numSet);
    return numSet;
  }

}
