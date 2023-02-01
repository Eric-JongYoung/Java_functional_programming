package Step03_Stream.ch03_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        //숫자 요소일 경우
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream
                .sorted() // 숫자를 기준으로 오름차순
                .forEach(n -> System.out.print(n + ","));
        System.out.println();

        //객체가 요소일 경우
        List<Student01> student02List = Arrays.asList(
                new Student01("루피", 10),
                new Student01("조로",20),
                new Student01("상디", 30)
        );

        student02List.stream()
                .sorted() // 점수를 기준으로 오름차순
                .forEach(s -> System.out.println(s.getScore() + ", "));
        System.out.println();

        student02List.stream()
                .sorted(Comparator.reverseOrder()) // 정수를 기준으로 내림차순으로 Student 정렬
                .forEach(s -> System.out.println(s.getScore() + ","));
    }
}
class Student01 implements Comparable<Student01>{
    private String name;
    private int score;

    public Student01(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /**
     * score < o.score : 음수리턴
     * score == o.score : 0 리턴
     * score > o.score : 양수리턴
     * */
    @Override
    public int compareTo(Student01 o) {
        return Integer.compare(score, o.score);
    }
}
