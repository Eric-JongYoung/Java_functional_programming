package Step01_Lamda.ch05_로컬변수사용;

public class UsingLocalVariable {
    void method(int arg){ // arg는 final 특성을 가짐
        int localVar = 40; // loaclVar 는 final 특성을 가짐

//        arg = 31; // final 특성 때문에 수정 불가
//        localVar = 41; // final 특성 때문에 수정 불가

        //람다식
        MyFunctionalInterface fi = () ->{
          // 로컬 변수 읽기
            System.out.println("arg :"+ arg);
            System.out.println("localVar : "+ localVar + "\n");
        };
        fi.method();
    }
}
/**
 * 람다식은 메소드 내부에서 주로 작성되기 때문에 로컬 익명 구현 객체를 생성시킨다고 봐야한다.
 * 람다식에서 바깥 클래스의 필드나 메소드는 제한 없이 사용할 수 있으나,
 * 메소드의 매개변수 또는 로컬 변수를 사용하면 이 두 변수는 final 특성을 가져야한다.
 *
 * 따라서, 매개 변수 또는 로컬 변수를 람다식에서 읽는 것은 허용되지만,
 * 람다식 내부 또는 외부에서 변경 할 수 없다.
 *
 * */