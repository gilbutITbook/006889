// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class OperatorExam {

    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3; // int i4 = ( i3 = i3+1)
        System.out.println(i4);
        System.out.println(i3);

        int i5 = i3++; // int i5 = i3;  i3 = i3+1;
        System.out.println(i5);

        int i = 5;
        int j = 2;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i / (double) j);
        System.out.println(i % j);
    }
}
