package Step03_Stream.ch01_스트림소개;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 * 람다식으로 요소 처리 코드를 제공한다.
 * */
public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("루피", 90),
                new Student("조로", 92)
        );

        Stream<Student> stream = list.stream(); // 스트림 얻기

        //List 컬랙션 에서 Student 를 가져와서 람다식의 매개값으로 제공
        stream.forEach(s ->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score);
                }
        );

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