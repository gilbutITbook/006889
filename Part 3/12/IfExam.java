// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class IfExam {

    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        if (x > y) {
            System.out.println("x는 y보다 큽니다.");
            System.out.println("test 1");
        }

        if (x > y) System.out.println("x는 y보다 큽니다.");
        System.out.println("test 2");

        if (x == y) {
            System.out.println("x는 y와 같습니다.");
        } else if (x > y) {
            System.out.println("x는 y보다 큽니다.");
        } else if (x < y) {
            System.out.println("x는 y보다 작습니다.");
        } else {
            System.out.println("x는 y와 다릅니다.");
        }
    }
}
