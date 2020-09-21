// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class ArrayExam {

    public static void main(String[] args) {
        int[] array1 = new int[100];

        array1[0] = 50; // 배열 array1의 0번 인덱스에 50이라는 값을 담습니다
        array1[10] = 100; // 배열 array1의 10번 인덱스에 100이라는 값을 담습니다

        int[] array2 = new int[] { 1, 2, 3, 4 };
        int[] array3 = { 1, 2, 3, 4 };
        int value = array3[0];
        System.out.println(value);
    }
}
