// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class ReferenceTypeExam {

    public static void main(String[] args) {
        ReferenceTypeExam exam = new ReferenceTypeExam();

        // 기본형 변수 value1을 addOne에 전달합니다.
        int value = 10;
        exam.addOne(value);
        System.out.println(
            "기본형 변수의 값을 다른 메서드에서 변경한 결과: " + value
        );

        // 참조형 변수 arr을 addOne에 전달합니다.
        int[] arr = { 10 };
        exam.addOne(arr);
        System.out.println(
            "참조형 변수의 값을 다른 메서드에서 변경한 결과: " + arr[0]
        );
    }

    public void addOne(int value) {
        value++;
    }

    public void addOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
}
