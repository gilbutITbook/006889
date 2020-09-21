// 정답 코드입니다

package javaStudy;

import java.util.Arrays;

public class Divisible {

    public int[] divisible(int[] array, int divisor) {
        int resultArraySize = 0; // 결괏값 배열의 크기를 알아낼 변수 선언
        for (int i = 0; i < array.length; i++) {
            if (
                array[i] % divisor == 0
            ) resultArraySize++; // 결과에 해당하는 값을 찾으면  //  resultArraySize 를 1 증가시킴
        }

        int[] ret = new int[resultArraySize]; // 결괏값을 담을 배열 생성
        int index = 0; // 결괏값 배열 인덱스를 위한 변수
        for (int i = 0; i < array.length; i++) {
            if (
                array[i] % divisor == 0
            ) ret[index++] = array[i]; // 조건에 맞는 값을 찾으면  // 결괏값 배열에 담아준다.
        }
        return ret;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = { 5, 9, 7, 10 };
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}
