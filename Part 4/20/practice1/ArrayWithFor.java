// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class ArrayWithFor {

    public int[] fill100() {
        int[] array = new int[100];
        // array가 1부터 100까지 순서대로 값을 가지도록 만들어 보세요.

        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }

    // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        ArrayWithFor exam = new ArrayWithFor();
        int[] arr2 = exam.fill100();
        int errCount = 0;
        for (int i = 0; i < 100; i++) {
            if (arr2[i] != i + 1) {
                System.out.println("array[" + i + "]의 값이 틀립니다.");
                errCount++;
            }
        }
        if (errCount == 0) System.out.println("정답입니다.");
    }
}
