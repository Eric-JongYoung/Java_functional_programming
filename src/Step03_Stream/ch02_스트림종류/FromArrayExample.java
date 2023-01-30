package Step03_Stream.ch02_스트림종류;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 배열로 부터 스트림 얻기
 */
public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"루피", "조로", "상디"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream inStream = Arrays.stream(intArray);
        inStream.forEach(a -> System.out.print(a + ","));
        System.out.println();
    }
}
