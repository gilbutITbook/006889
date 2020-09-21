// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class ForEachExam {

    public static void main(String[] args) {
        int[] iarr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < iarr.length; i++) {
            int value = iarr[i];
            System.out.println(value);
        }

        for (int value : iarr) {
            System.out.println(value);
        }
    }
}
