// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class FindKim {

    public String findKim(String[] seoul) {
        // x에 김서방의 위치를 저장하세요.
        int x = 0;

        return "김서방은 " + x + "에 있다";
    }

    // 아래는 실행을 위한 테스트 코드입니다.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = { "Queen", "Tod", "Kim" };
        System.out.println(kim.findKim(names));
    }
}
