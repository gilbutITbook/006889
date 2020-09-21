// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class Car {
    // 형 + 필드명
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        //		this.name = "이름없음";
        //		this.number = 0;
        this("이름없음", 0);
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
