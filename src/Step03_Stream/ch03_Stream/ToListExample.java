package Step03_Stream.ch03_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Student03> totalList = Arrays.asList(
                new Student03("루피", 10, Student03.Sex.MALE),
                new Student03("로빈", 6, Student03.Sex.FEMALE),
                new Student03("조로", 10, Student03.Sex.MALE),
                new Student03("나미", 6, Student03.Sex.FEMALE)
        );

        // 남학생만 묶어서 list
        List<Student03> maleList = totalList.stream()
                .filter(s ->s.getSex()== Student03.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //여학생들만 묶어 HashSet 생성
        Set<Student03> femaleSet = totalList.stream()
                .filter(s -> s.getSex()== Student03.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}

class Student03{
    public enum Sex { MALE, FEMALE}
    public enum City { Seoul, Busan}

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student03(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student03(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }
}
