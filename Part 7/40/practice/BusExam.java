// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

//아래는 실행을 위한 코드입니다. 수정하지 마세요.
package javaStudy;

public class BusExam {

    public static void main(String[] args) {
        Bus bus = new Bus("뛰뛰", 3000, 1050);
        if (bus.name != "뛰뛰") {
            System.out.println("bus의 name이 다릅니다.");
        } else if (bus.number != 3000) {
            System.out.println("bus의 number가 다릅니다.");
        } else if (bus.fee != 1050) {
            System.out.println("bus의 fee가 다릅니다.");
        } else {
            System.out.println("정답입니다.");
        }
    }
}
