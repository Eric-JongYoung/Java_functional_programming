package Step03_Stream.ch01_스트림소개;

import java.util.Arrays;
import java.util.List;
/**
 * 스트림은 중간 처리와 최종 처리를 할 수 있다.
 * */
public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("루피", 10),
                new Student("조로", 20),
                new Student("상디", 30)
        );

        double avg = studentList.stream()
                .mapToInt(Student::getScore) //중간 처리 ( 학생 객체를 점수로 매핑 )
                .average()  //최종처리 (평균 점수)
                .getAsDouble();
        System.out.println("평균점수 : " + avg);
    }
}
