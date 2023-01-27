package Step02_Collection.ch01_List;

import java.util.List;
import java.util.Vector;

/**
 * Vector 는 동기화된 메소드로 구성
 * 멀티 스레드가 동시에 이 메소드를 실행할 수 없고,
 * 하나의 스레드가 실행 완료해야만 다른 스레드를 실행할 수 있다.
 * Thread Safe
 * */
public class VectorExample {
    public static void main(String[] args) {

        List<Board> list = new Vector<Board>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for (Board x : list) {
            System.out.println(x.subject + " : " + x.content + " : " + x.writer);
        }

    }

}


class Board{
    String subject;
    String content;
    String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}