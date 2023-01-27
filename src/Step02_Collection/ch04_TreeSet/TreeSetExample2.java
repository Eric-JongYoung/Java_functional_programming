package Step02_Collection.ch04_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * 객체 정렬하기
 * */
public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);


        // 내림차순
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();


        // 오름차순
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (Integer score : ascendingSet) {
            System.out.print(score + " ");
        }

    }
}
