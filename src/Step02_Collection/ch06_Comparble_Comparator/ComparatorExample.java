package Step02_Collection.ch06_Comparble_Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {

        /**
         * Fruit 이 Comparable 을 구현하지 않아서, 예외 발생함
        TreeSet<Fruit> treeSet = new TreeSet<>();
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
         */

        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator()); // 내림차순 정렬자 제공
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " : "+ fruit.price);
        }
    }
}



class Fruit{
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class DescendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1; //가격이 작을 경우 뒤로오게
        else if(o1.price == o2.price) return 0;
        else return -1; // 가격이 클경우 앞에 오게
    }
}
