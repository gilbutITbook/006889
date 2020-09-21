// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class IfExam {

    public int IfTest(int value) {
        // 변수 value가 선언되어 있다고 가정하고 코드를 작성하세요.
        int ret = 0;
        if (value % 3 == 0) {
            ret = 3;
        } // 이 아래 else 문을 추가해서 코드를 완성하세요.

        return ret; // 결과 체크를 위한 코드입니다.
    }

    // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        IfExam exam = new IfExam();
        System.out.println(exam.IfTest(6));
        System.out.println(exam.IfTest(8));
    }
}
