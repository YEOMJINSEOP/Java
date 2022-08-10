package f.niosecond;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.charset.*;

public class FilesManager {

  public static void main(String[] args) {
    FilesManager sample = new FilesManager();
    String fileName = "AboutNIO2.text";
    Path fromPath = sample.writeAndRead(fileName);
    sample.copyMoveDelete(fromPath, fileName);
  }

  public List<String> getContents() {
    List<String> contents = new ArrayList<String>();
    contents.add("첫 번 째 줄을 add했다");
    contents.add("두 번 째 줄부터는 무엇을 쓸까?");
    contents.add("세 번 째 줄부터는 정말 뭘 써야하나");
    contents.add("마지막 줄이다. 그만 써야겠어");
    contents.add("Current Date = " + new Date());
    return contents;
  }

  public Path writeFile(Path path) throws Exception {
    Charset charset = Charset.forName("EUC-KR");
    List<String> contents = getContents();
    StandardOpenOption openOption = StandardOpenOption.CREATE;
    return Files.write(path, contents, charset, openOption);
  }

  public void readFile(Path path) throws Exception {
    Charset charset = Charset.forName("EUC-KR");
    System.out.println("Path = " + path);
    List<String> fileContents = Files.readAllLines(path, charset);
    for (String tempContents : fileContents) {
      System.out.println(tempContents);
    }
    System.out.println();
  }

  public Path writeAndRead(String fileName) {
    Path returnPath = null;
    try {
      Path path = Paths.get(fileName);
      // Write a text file
      returnPath = writeFile(path);
      // Read written file
      System.out.println("***** Created file contents *****");
      readFile(returnPath);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return returnPath;
  }

  public void copyMoveDelete(Path fromPath, String fileName){
    try{
      Path toPath = fromPath.toAbsolutePath().getParent();

      // Make a directory if it does not exist.
      Path copyPath =  toPath.resolve("copied");
      if(!Files.exists(copyPath)){
        Files.createDirectories(copyPath);
      }

      // Copy file
      Path copiedFilePath = copyPath.resolve(fileName);
      StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
      Files.copy(fromPath, copiedFilePath, copyOption);

      // Read copied file
      System.out.println("***** Copied file contents *****");
      readFile(copiedFilePath);

      // Move file
      Path movedFilePath = Files.move(copiedFilePath,
        copyPath.resolve("moved.txt"), copyOption);

      // Delete files
        Files.delete(movedFilePath);
        Files.delete(copyPath);
  } catch (Exception e){
    e.printStackTrace();
  }
}
