// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

// 실행을 위한 코드입니다.
package javaStudy;

public class CarExam {

    public static void main(String[] args) {
        Car car = new Car();
        if (car instanceof Machine) {
            System.out.println("Car가 Machine을 상속받았습니다.");
        } else {
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }
}
