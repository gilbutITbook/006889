// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class MethodOverloadExam {

    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4, 6, 7));
        System.out.println(m.plus("hello", "world"));
    }
}
