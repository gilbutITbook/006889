// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class OperatorExam2 {

    public void calculate(int a, int b) {
        // a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.

        // a와 b가 같은지 비교한 결과를 d에 저장하세요.

        // a와 b가 다른지 비교한 결과를 e에 저장하세요.

        System.out.println(a + "은(는) " + b + "보다 큽니까? " + c);
        System.out.println(a + "은(는) " + b + "와(과) 같습니까? " + d);
        System.out.println(a + "은(는) " + b + "와(과) 다릅니까? " + e);
    }

    public static void main(String[] args) {
        // 0~10 사이 값을 랜덤하게 변수 a와 b에 넣어줍니다.
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        new OperatorExam2().calculate(a, b);
    }
}
