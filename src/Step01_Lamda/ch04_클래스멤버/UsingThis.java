package Step01_Lamda.ch04_클래스멤버;

public class UsingThis {
    public int outterField = 10;

    /**
     * 익명 객체 내부에서 this 는 익명 객체의 참조이지만,
     * 람다식에서 this 는 내부적으로 생성되는 익명 개게의 참조가 아니라,
     * 람다식을 실행한 객체의 참조이다.
     */
    class Inner {
        int innerField = 20;

        void method() {
            //람다식
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterField : " + UsingThis.this.outterField + "\n");

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField + "\n");
            };

            fi.method();
        }
    }
}
