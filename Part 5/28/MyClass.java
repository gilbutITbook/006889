// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class MyClass {

    // public 리턴형 메서드명 (매개변수들){ 필요한 기능 구현 }
    public void method1() {
        System.out.println("m1이 실행됨..");
    }

    public void method2(int x) {
        System.out.println(x + "을 이용한 m2 실행");
    }

    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    public void method4(int x, int y) {
        System.out.println(x + y + "m4 실행");
    }

    public int method5(int y) {
        System.out.println(y + "이용한 m5 실행");
        return y * 2;
    }
}
