// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class GetMinMaxString {

    public String getMinMaxString(String str) {
        return "";
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        String str2 = "-1 -2 -3 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        // 아래는 테스트로 출력해보기 위한 코드입니다.
        System.out.println("최댓값과 최솟값은?" + minMax.getMinMaxString(str));
        System.out.println("최댓값과 최솟값은?" + minMax.getMinMaxString(str2));
    }
}
