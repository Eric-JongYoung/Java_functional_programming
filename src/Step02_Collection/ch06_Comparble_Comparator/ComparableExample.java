package Step02_Collection.ch06_Comparble_Comparator;

import java.util.Iterator;
import java.util.TreeSet;
/**
 * 사용자 정의 객체를 나이순으로 정렬하기
 * */
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();


        // 저장될때 나이 순으로 정렬됨.
        treeSet.add(new Person("루피", 45));
        treeSet.add(new Person("조로", 25));
        treeSet.add(new Person("상디", 31));

        // 왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기 (오름차순)
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + " : " + person.age);
        }
    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
