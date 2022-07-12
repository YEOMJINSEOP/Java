package e.io;

import java.io.File;

public class FileFilterSample {
  public static void main(String[] args) {
    FileFilterSample sample = new FileFilterSample();
    String pathName = "/Users/yeomjinseop/Desktop/Files/Java/godOfJava/FileIO/text";
    sample.checkList(pathName);
  }

  public void checkList(String pathName) {
    File file;
    try {
      file = new File(pathName);
      // File[] mainFileList = file.listFiles();
      // File[] mainFileList = file.listFiles(new JPEGFilenameFilter());
      File[] mainFileList = file.listFiles(new JPEGFileFilter());
      for (File tempFile : mainFileList) {
        System.out.println(tempFile.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
