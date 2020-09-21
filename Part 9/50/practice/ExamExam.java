// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class ExamExam {

    public static void main(String[] args) {
        ExceptionExam ex = new ExceptionExam();
        // Test를 위한 코드 입니다.
        int[] array = null;
        array = new int[50];
        array[49] = 100;
        System.out.println(
            "array배열의 50번째 요소의 값 : " + ex.get50thItem(array)
        );

        array = new int[49];
        array[48] = 100;
        System.out.println(
            "array배열의 50번째 요소의 값 : " + ex.get50thItem(array)
        );
    }
}
