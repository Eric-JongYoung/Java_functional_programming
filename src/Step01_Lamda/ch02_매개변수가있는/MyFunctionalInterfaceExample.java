package Step01_Lamda.ch02_매개변수가있는;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x*5);
        };
        fi.method(2);

        // 매개변수 하나일경우 괄호() 를 생략할 수 있다.
        fi = x -> System.out.println(x*5);
        fi.method(2);
    }
}
