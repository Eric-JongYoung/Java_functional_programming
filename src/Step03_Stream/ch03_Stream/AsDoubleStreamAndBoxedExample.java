package Step03_Stream.ch03_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * IntStream 의 int 요소, LongStream 의 long 요소를
 * double 요소로 타입변환 해서 DoubleStream 을 생성한다.
 * */
public class AsDoubleStreamAndBoxedExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream() // DoubleStream 생성
                .forEach(d -> System.out.println(d));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed() // Stream<Integer> 생성
                .forEach(obj -> System.out.println(obj.intValue()));
    }
}
