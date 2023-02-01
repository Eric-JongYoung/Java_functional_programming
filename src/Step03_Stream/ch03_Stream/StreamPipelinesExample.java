package Step03_Stream.ch03_Stream;

import java.util.Arrays;
import java.util.List;
/**
 * 스트림 파이프 라인
 * */
public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("루피", Member.MALE, 30),
                new Member("나미", Member.FEMALE, 20),
                new Member("조로", Member.MALE, 45),
                new Member("로빈", Member.FEMALE, 27)
        );

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 평균 나이 :" + ageAvg);
    }
}
class Member{
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    public Member(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
