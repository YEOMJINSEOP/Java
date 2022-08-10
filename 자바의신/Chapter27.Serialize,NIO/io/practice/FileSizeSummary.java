package e.io.practice;

import java.io.File;

public class FileSizeSummary {
  public static void main(String[] args) {
    FileSizeSummary sample = new FileSizeSummary();
    String path = "/User/yeomjinseop/desktop/files/java/godofjava";
    long sum = sample.printFileSize(path);
    System.out.println(path + "'s total size = " + sum);
  }

  public long printFileSize(String dirName) {
    long sum = 0;
    File dir = new File(dirName);
    if (dir.isDirectory()) {
      File[] fileList = dir.listFiles();
      for (File file : fileList) {
        if (file.isFile()) {
          String tempFileName = file.getAbsolutePath();
          long fileLength = file.length();
          System.out.println(tempFileName + " = " + fileLength);
          sum += fileLength;
        } else {
          String tempDirName = file.getAbsolutePath();
          long fileLength = printFileSize(tempDirName);
          System.out.println("[" + tempDirName + "] = " + fileLength);
          sum += fileLength;
        }
      }
    }
    return sum;
  }
}
