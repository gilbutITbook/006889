// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class Bus extends Car {
    int fee;

    public Bus(String name, int number, int fee) {
        // super를 이용해서 Car클래스의 생성자를 이용하세요.

        this.fee = fee;
    }
}
