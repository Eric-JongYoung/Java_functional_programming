package Step02_Collection.ch05_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "브룩");
        scores.put(98, "루피");
        scores.put(75, "조로");
        scores.put(95, "상디");
        scores.put(80, "나미");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue());

        entry = scores.lowerEntry(95);
        System.out.println("95 점 아래 점수 : " + entry.getKey() + " - " + entry.getValue());

        entry = scores.higherEntry(95);
        System.out.println("95점 위의 점수 : " + entry.getKey() + " - " + entry.getValue());

        entry = scores.floorEntry(85);
        System.out.println("85점 이거나 바로 아래 점수 : " + entry.getKey() + " - " + entry.getValue());

        entry = scores.ceilingEntry(85);
        System.out.println("85점 이거나 바로 위의 점수 : " + entry.getKey() + " - " + entry.getValue());

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + " - " + entry.getValue() + "(남은 객체수 : " + scores.size()+")");
        }
    }
}
