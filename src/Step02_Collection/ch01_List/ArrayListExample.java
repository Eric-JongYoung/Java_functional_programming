package Step02_Collection.ch01_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //String 객체 저장
        list.add("Java");
        list.add("JavaScript");
        list.add("AWS");
        list.add(2, "DB");
        list.add("JPA");

        int size = list.size(); // 저장된 총 객체 수 얻기
        System.out.println("총 객체수 : " + size);
        System.out.println();

        String skill = list.get(2); // 2번 인덱스의 객체 얻기
        System.out.println("2 :" + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
            System.out.println(i + " : " + list.get(i));
        }
        System.out.println();

        list.remove(2); // 2번 인덱스 객체(DB) 삭제
        list.remove(2); // 2번 인덱스 객체(AWS) 삭제
        list.remove("JPA");

        for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
            System.out.println(i + " : " + list.get(i));
        }
        System.out.println();


    }
}
