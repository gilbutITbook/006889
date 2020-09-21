// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class ExceptionExam3 {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        return k;
    }
}