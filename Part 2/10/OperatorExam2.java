// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class OperatorExam2 {

    public static void main(String[] args) {
        int i = 10;
        int j = 10;

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j); // i가 j보다 작습니까?
        System.out.println(i <= j); // i가 j보다 작거나 같습니까?
        System.out.println(i > j); // i가 j보다 큽니까?
        System.out.println(i >= j); // i가 j보다 크거나 같습니까?

        i += 10;
        System.out.println(i);
        System.out.println(i -= 5);
    }
}
