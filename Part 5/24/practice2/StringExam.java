// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class StringExam {

    public static void main(String[] args) {
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        if (str1.equals(str2)) {
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        } else {
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }
    }
}
