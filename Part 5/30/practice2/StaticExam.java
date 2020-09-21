// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class StaticExam {

    public static void main(String[] args) {
        Car taxi = new Car();
        Car suv = new Car();

        taxi.wheelCount = 10;
        suv.wheelCount = 4;

        System.out.println("taxi의 바퀴 수:" + taxi.wheelCount);
        System.out.println("suv의 바퀴 수:" + suv.wheelCount);
    }
}
