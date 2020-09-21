// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

//실행을 위한 코드입니다.
package javaStudy;

public class CarExam {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자동차");
        Car car3 = new Car("자동차", 1234);
        System.out.println(car1.name + " , " + car1.number);
        System.out.println(car2.name + " , " + car2.number);
        System.out.println(car3.name + " , " + car3.number);
    }
}
