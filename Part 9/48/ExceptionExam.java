// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class ExceptionExam {

    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다." + e.toString());
        } finally {
            System.out.println("예외와 상관 없이 무조건 실행!");
        }
        System.out.println("main end!!");
    }
}
