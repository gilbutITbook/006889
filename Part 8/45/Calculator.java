// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public interface Calculator {
    public int plus(int i, int j);

    public int multiple(int i, int j);

    default int exec(int i, int j) {
        return i + j;
    }

    public static int exec2(int i, int j) {
        return i * j;
    }
}
