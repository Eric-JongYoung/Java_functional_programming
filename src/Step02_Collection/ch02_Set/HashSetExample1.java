package Step02_Collection.ch02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("AWS");
        set.add("Spring");
        set.add("JPA");
        set.add("JPA"); // 한번만 저장됨

        int size = set.size(); // 저장된 객체 수 얻기
        System.out.println("총 객체수 : " + size);

        Iterator<String> iterator = set.iterator(); // 반복자 얻기
        while (iterator.hasNext()) { // 객체 수 만큼 루핑
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("JPA");

        System.out.println("총 객체수 : " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()) { // 객체 수 만큼 루핑
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
    }
}
