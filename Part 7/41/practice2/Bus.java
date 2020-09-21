// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class Bus extends Car {

    public void run() {
        // Car 클래스의 run을 호출합니다.
        super.run();
        // 추가 작업을 수행합니다.
        System.out.println("다음 정거장을 안내합니다.");
    }
}
