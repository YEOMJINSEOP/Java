package f.niosecond;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.charset.*;

public class FilesManager {
  public List<String> getContents() {
    List<String> contents = new ArrayList<String>();
    contents.add("첫 번 째 줄을 add했다");
    contents.add(" 두 번 째 줄부터는 무엇을 쓸까?");
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
}
