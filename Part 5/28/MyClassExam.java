// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class MyClassExam {

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(10);
        int value = myclass.method3();
        System.out.println("m3가 리턴한 값" + value);
        myclass.method4(5, 10);
        int value2 = myclass.method5(55);
        System.out.println("m5가 리턴한 값: " + value2);
    }
}