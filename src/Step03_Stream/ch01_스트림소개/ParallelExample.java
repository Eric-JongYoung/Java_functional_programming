package Step03_Stream.ch01_스트림소개;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 내부 반복자를 사용하므로 병렬처기가 쉽다.
 * */
public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("루피", "조로", "상디", "쵸파", "나미");

        // 순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample :: print); // s -> ParallelExample.print(s) 와 동일

        System.out.println();

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample :: print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
