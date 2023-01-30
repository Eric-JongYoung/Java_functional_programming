package Step03_Stream.ch02_스트림종류;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * List 컬렉션에서 Stream 를 얻어내고 요소를 콘솔에 출력한다.
 * */
public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("루피", 10),
                new Student("조로", 20),
                new Student("상디", 30)
        );
        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
