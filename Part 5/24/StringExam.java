// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class StringExam {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2) System.out.println(
            "str1과 str2는 같은 레퍼런스입니다"
        );

        if (str3 == str4) System.out.println(
            "str3과 str4는 같은 레퍼런스입니다"
        );

        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1);
    }
}
