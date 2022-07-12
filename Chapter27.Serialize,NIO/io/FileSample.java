package e.io;

import java.io.File;
import java.util.Date;

public class FileSample {
  public static void main(String[] args) {
    FileSample sample = new FileSample();
    String pathName = "/Users/yeomjinseop/Desktop/Files/Java/godOfJava/FileIO/text";
    sample.checkPath(pathName);
    sample.makeDir(pathName);
    sample.checkFileMethods(pathName);
    sample.lastModified(pathName);
  }

  public void checkPath(String pathName) {
    File file = new File(pathName);
    System.out.println(pathName + " is exists? = " + file.exists());
  }

  public void makeDir(String pathName) {
    File file = new File(pathName);
    System.out.println("Make " + pathName + " result = " + file.mkdirs());
  }

  public void checkFileMethods(String pathName) {
    File file = new File(pathName);
    System.out.println(pathName + " is directory? " + file.isDirectory());
    System.out.println(pathName + " is file? " + file.isFile());
    System.out.println(pathName + " is hidden? " + file.isHidden());
  }

  public void lastModified(String pathName) {
    File file = new File(pathName);
    System.out.println(pathName + " last Modified = " + new Date(file.lastModified()));
  }
}