// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class ExceptionExam {

    public static void main(String[] args) {
        ExceptionExam exam = new ExceptionExam();
        int[] array = new int[10];

        try {
            exam.get50thItem(array);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int get50thItem(int[] array) throws MyCheckedException {
        if (array.length < 50) {
            throw new MyCheckedException();
        }
        return array[49];
    }
}