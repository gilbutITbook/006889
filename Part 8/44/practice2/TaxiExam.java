// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class TaxiExam {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.println("기본요금 변경 전!!");
        taxi.stop(20);
        taxi.BASE_FARE = 2500;
        System.out.println("기본요금 변경 후!!");
        taxi.stop(20);
    }
}
