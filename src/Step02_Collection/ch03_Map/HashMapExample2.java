package Step02_Collection.ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "고짜오"), 190);
        map.put(new Student(1, "고짜오"), 190);// 학번과 이름이 동일한 Student 로 저장

        System.out.println("총 Entry 수: " + map.size());

    }
}
class Student{
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { // 학번과 이름이 동일하면 true 리턴
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (sno == student.sno) && (name.equals(student.name));
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() { // 학번과 이름이 같다면 동일한 값을 리턴
        return sno + name.hashCode();
    }
}
