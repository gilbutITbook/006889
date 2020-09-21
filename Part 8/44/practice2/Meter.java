// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public interface Meter {
    public int BASE_FARE = 3000;

    // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
    public abstract void start();

    public abstract int stop(int distance);
}
