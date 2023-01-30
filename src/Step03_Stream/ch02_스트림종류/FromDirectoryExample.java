package Step03_Stream.ch02_스트림종류;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 * 디렉토리로부터 스트림 얻기
 * */
public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/jy/self_study/FP/src/Step03_Stream/ch02_스트림종류");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
    }
}
