package Step02_Collection.ch02_Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("고종영", 30));
        set.add(new Member("고종영", 30)); // 인스턴스는 다르지만, 내부 데이터가 동일하므로 객체 1개만 저장

        System.out.println("총 객체수 : " + set.size());
    }


}

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {  // name 과 age 가 같으면 동일한 hashCode 가 리턴
        return name.hashCode() + age; // String 의 HashCode 사용
    }
}
