package Step02_Collection.ch03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        //Map 컬랙션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //객체 저장
        map.put("고짜오", 30);
        map.put("고이스", 40);
        map.put("루피쿤", 40);
        map.put("루피쿤", 47); // key 가 같기 때문에 제일 마지막 저장한 값으로 대치

        // 객체 찾기
        System.out.println("\t고짜오 : " + map.get("고짜오"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet(); // KeySet 얻기
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("루피쿤");
        System.out.println("총 Entry 수 : " + map.size());

        //객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
