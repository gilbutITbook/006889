// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

// 아래는 실행을 위한 코드입니다. 수정하지 마세요.
package javaStudy;

public class MeterExam {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        boolean a = Meter.class.isInstance(taxi);
        if (a != true) {
            System.out.println(
                "Taxi클래스는 Meter인터페이스를 구현해야 합니다."
            );
        } else if (taxi.stop(200) != 400) {
            System.out.println("stop(200)의 값은 400이어야 합니다.");
        } else {
            System.out.println("정답입니다.");
        }
    }
}
