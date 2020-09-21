// 정답 코드입니다

package javaStudy;

public class GetMinMaxString {

    public String getMinMaxString(String str) {
        String[] strArr = str.split(" ");
        int maxValue = Integer.parseInt(strArr[0]);
        int minValue = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            int value = Integer.parseInt(strArr[i]);

            if (maxValue < value) maxValue = value;
            if (minValue > value) minValue = value;
        }
        return minValue + " " + maxValue;
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
