// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

public class ArrayWithFor {

    public static void main(String[] args) {
        int[] iarray = new int[100];
        //		iarray[0] = 1;
        //		iarray[1] = 2;

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        int sum = 0;
        for (int i = 0; i < iarray.length; i++) {
            sum = sum + iarray[i];
        }

        System.out.println(sum);
    }
}
