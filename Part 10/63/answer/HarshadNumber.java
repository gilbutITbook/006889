// 정답 코드입니다

package javaStudy;

public class HarshadNumber {

    public boolean isHarshad(int num) {
        int su = num;
        int sum = 0;
        boolean isHarshad = false;
        while (su > 0) {
            sum += su % 10;
            su = su / 10;
        }
        if (num % sum == 0) isHarshad = true;
        return isHarshad;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        HarshadNumber sn = new HarshadNumber();

        System.out.println(sn.isHarshad(10));
        System.out.println(sn.isHarshad(18));
        System.out.println(sn.isHarshad(11));
        System.out.println(sn.isHarshad(13));
    }
}
