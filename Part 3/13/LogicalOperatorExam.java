// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class LogicalOperatorExam {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println(b2 || b2);

        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        System.out.println(!b1);
        System.out.println(!b2);

        int score = 88;
        if (score >= 70 && score <= 100) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}
