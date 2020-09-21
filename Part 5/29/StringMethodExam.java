// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class StringMethodExam {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);
        str = str.concat(" world");
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
