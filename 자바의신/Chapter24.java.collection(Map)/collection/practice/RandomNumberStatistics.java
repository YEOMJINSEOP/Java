package d.collection.practice;

import java.util.Random;
import java.util.Hashtable;
import java.util.Set;

public class RandomNumberStatistics {

  private final int DATA_BOUNDARY = 50;
  Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();

  public static void main(String[] args) {
    RandomNumberStatistics sample = new RandomNumberStatistics();
    sample.getRandomNumberStatistics();
  }

  public void getRandomNumberStatistics() {
    Random random = new Random();
    for (int i = 0; i < 5000; i++) {
      int tempNumber = random.nextInt(51);
      putCurrentNumber(tempNumber);
    }
    printStatistics();
  }

  public void putCurrentNumber(int tempNumber) {
    if (hashTable.containsKey(tempNumber)) {
      hashTable.put(tempNumber, hashTable.get(tempNumber) + 1);
    } else {
      hashTable.put(tempNumber, 1);
    }
  }

  public void printStatistics() {
    Set<Integer> keySet = hashTable.keySet();
    for (int tempkey : keySet) {
      System.out.print(tempkey + " = " + hashTable.get(tempkey) + "   ");
      if (tempkey % 10 - 1 == 0) {
        System.out.println();
      }
    }
  }

}
