// 정답 코드입니다

package javaStudy;

public class ReverseStr {

    public String reverseStr(String str) {
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] < chars[j]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }
}
