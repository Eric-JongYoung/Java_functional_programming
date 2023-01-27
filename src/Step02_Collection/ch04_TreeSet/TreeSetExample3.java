package Step02_Collection.ch04_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * 영어단어를 정렬하고, 범위 검색해보기
 * */

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");
        System.out.println("[c~f 사이의 단어 검색]");

        //subSet (시작객체, 시작객체의 포함여부 , 끝 객체, 끝 객체의 포함여부)
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for (String word : rangeSet) {
            System.out.print(word+ " ");
        }
    }
}
