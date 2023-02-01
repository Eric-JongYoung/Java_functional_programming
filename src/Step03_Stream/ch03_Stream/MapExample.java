package Step03_Stream.ch03_Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴한다.
 */
public class MapExample {
    public static void main(String[] args) {
        List<Student> student02List = Arrays.asList(
                new Student("루피", 10),
                new Student("조로", 20),
                new Student("상디", 30)
        );

        student02List.stream()
                .mapToInt(Student::getScore)
                .forEach(score -> System.out.println(score));
    }
}

class Student {
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