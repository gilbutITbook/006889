// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

import java.util.Scanner;

public class DoWhileExam {

    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do {
            value = scan.nextInt();
            System.out.println("입력 받은 값:" + value);
        } while (value != 10);
        System.out.println("반복문 종료!!");
    }
}
