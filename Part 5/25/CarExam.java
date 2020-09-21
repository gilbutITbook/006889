// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class CarExam {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}
