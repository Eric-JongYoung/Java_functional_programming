package Step03_Stream.ch01_스트림소개;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
/**
 * 반복자 스트림
 * */
public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("루피", "조로", "상디");

        //Iterator 이용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        // Stream

        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
