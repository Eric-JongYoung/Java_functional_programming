package Step02_Collection.ch03_Map;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();

        // 아이디와 비밀번호를 미리 입력
        map.put("Spring", "12");
        map.put("Summer", "123");
        map.put("Fall", "1234");
        map.put("Winter", "12345");


        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디 :");
            String id = kb.nextLine();

            System.out.print("비밀번호: ");
            String pwd = kb.nextLine();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pwd)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                }else {
                    System.out.println("비밀 번호가 일치 하지 않습니다. ");
                }
            }else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }
    }
}
