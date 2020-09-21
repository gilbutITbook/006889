// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class ArrayExam2 {

    public static void main(String[] args) {
        int[][] array4 = new int[3][4];
        array4[0][1] = 10;

        int[][] array5 = new int[3][];
        array5[0] = new int[1];
        array5[0] = new int[2];
        array5[0] = new int[3];
        array5[0][0] = 10;

        int[][] array6 = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
        System.out.println(array6[0][0]);
    }
}
