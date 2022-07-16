package f.niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PathsAndFiles {
  public static void main(String[] args) {
    PathsAndFiles sample = new PathsAndFiles();
    String dir = "Users/yeomjinseop/Desktop/nio2";
    // sample.checkPath(dir);
    String dir2 = "Users/yeomjinseop";
    sample.checkPath2(dir, dir2);
  }

  public void checkPath(String dir) {
    Path path = Paths.get(dir);
    System.out.println(path.toString());
    System.out.println("getFileName() : " + path.getFileName());
    System.out.println("getNameCount() : " + path.getNameCount());
    System.out.println("getParent() : " + path.getParent());
    System.out.println("getRoot() : " + path.getRoot());
  }

  public void checkPath2(String dir1, String dir2) {
    Path path = Paths.get(dir1);
    Path path2 = Paths.get(dir2);

    Path relativized = path2.relativize(path);
    System.out.println("relativized path = " + relativized);

    Path absolute = relativized.toAbsolutePath();
    System.out.println("toAbsolutePath path = " + absolute);

    Path normalized = absolute.normalize();
    System.out.println("normalized path = " + normalized);

    Path resolved = path.resolve("resolve_file");
    System.out.println("resolved path = " + resloved);
  }
}
