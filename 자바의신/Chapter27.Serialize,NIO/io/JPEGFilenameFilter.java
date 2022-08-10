package e.io;

import java.io.File;
import java.io.FilenameFilter;

public class JPEGFilenameFilter implements FilenameFilter {
  @Override
  public boolean accept(File file, String fileName) {
    if (fileName.endsWith(".jpeg"))
      return true;
    return false;
  }
}
