package Step03_Stream.ch03_Stream;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //예외 발생
        /*
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(avg);
         */

        //방법 1.
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법 1 _ 평균 : " + optional.getAsDouble());
        } else {
            System.out.println("방법 1 _ 평균 : " + 0.0);
        }

        //방법 2.
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2 _ 평균 : " + avg);

        // 방법 3
        list.stream()
                .mapToInt(Integer:: intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3 _ 평균 : "+ a));
    }
}
