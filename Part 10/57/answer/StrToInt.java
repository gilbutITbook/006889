// 정답 코드입니다

package javaStudy;

public class StrToInt {

    public int getStrToInt(String str) {
        int result = 0;
        int sign = 1;
        int index = 1;
        char ch = str.charAt(0);
        if (ch == '-') sign = -1; else if (ch == '+') sign = 1; else index = 0;

        for (int i = index; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }

        return sign * result;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
        System.out.println(strToInt.getStrToInt("+1234"));
        System.out.println(strToInt.getStrToInt("1234"));
    }
}
