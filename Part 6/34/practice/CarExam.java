// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

//실행을 위한 코드입니다.
package javaStudy;

public class CarExam {

    public static void main(String[] args) {
        // Person 클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
        Car car = new Car();

        car.run();
        // int형 매개변수를 받는 run을 호출합니다.
        car.run(100);
    }
}
