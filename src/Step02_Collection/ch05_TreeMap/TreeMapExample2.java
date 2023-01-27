package Step02_Collection.ch05_TreeMap;

import java.util.*;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "브룩");
        scores.put(98, "루피");
        scores.put(75, "조로");
        scores.put(95, "상디");
        scores.put(80, "나미");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.print(entry.getKey()+ " - "+ entry.getValue() + " ");
        }
        System.out.println();

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.print(entry.getKey()+ " - "+ entry.getValue() + " ");
        }
    }
}
