// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class ArrayExam2 {

    public static void main(String[] args) {
        int[][] array = { { 1 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

        // 2차원 배열 array를 출력합니다.
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "번째 줄을 출력합니다>");
            for (int j = 0; j < array[i].length; j++) {
                // System.out.print는 줄을 바꾸지 않고 출력하는 코드입니다.
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 줄바꿈을 해 주는 코드입니다.
        }
    }
}
