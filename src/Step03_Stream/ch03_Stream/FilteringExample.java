package Step03_Stream.ch03_Stream;

import java.util.Arrays;
import java.util.List;
/**
 * 필터링
 * */
public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("루피","조로","상디","쵸파","나미","루피");

        names.stream()
                .distinct() // 중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("쵸")) // 필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream() //중복 제거 후 필터링
                .distinct()
                .filter(n -> n.startsWith("루"))
                .forEach(n -> System.out.println(n));
    }
}
