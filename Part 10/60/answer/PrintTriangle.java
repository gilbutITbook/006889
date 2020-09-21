// 정답 코드입니다

package javaStudy;

public class PrintTriangle {

    public String printTriangle(int num) {
        String star = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println(pt.printTriangle(3));
    }
}
