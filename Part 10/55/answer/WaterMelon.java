// 정답 코드입니다

package javaStudy;

public class WaterMelon {

    public String watermelon(int n) {
        String resultStr = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) resultStr += "수"; else resultStr += "박";
        }
        return resultStr;
    }

    // 아래는 실행을 위한 테스트 코드입니다.
    public static void main(String[] args) {
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
