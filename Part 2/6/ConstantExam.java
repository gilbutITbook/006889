// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class ConstantExam {

    public static void main(String[] args) {
        final double PI = 3.14159;
        int radius = 3;
        double result = radius * 2 * PI;
        System.out.println(result);

        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;
        System.out.println(totalPrice);
    }
}
