package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {

  public void run() {
    printCurrentTime();
  }

  public void printCurrentTime() {
    Date date = new Date();
    try {
      for (int loop = 0; loop < 10; loop++) {
        long currentTime = System.currentTimeMillis();
        long timeGap = currentTime % 1000;
        System.out.println(date.toString() + "  " + currentTime);
        // Thread.sleep(1000);
        Thread.sleep(1000 - timeGap);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
