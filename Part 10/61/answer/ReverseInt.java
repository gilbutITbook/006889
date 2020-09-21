// 정답 코드입니다

package javaStudy;

public class ReverseInt {

    public int reverseInt(int n) {
        int i = 1;

        //1) 정수의 자릿수를 구한다.
        int count = 0;
        while (i <= n) {
            i = i * 10;
            count++;
        }
        i = i / 10;
        int arrCount = 0;
        //2) 자릿수 크기만큼의 정수 배열을 선언한다.
        int[] arr = new int[count];

        //3) 해설의 2)에서 구한 배열에 각 자리의 수를 저장한다.
        while (n > 0) {
            arr[arrCount] = n / i;
            n = n % i;
            i = i / 10;
            arrCount++;
        }

        //4) 배열에 있는 값을 내림차순으로 정렬한다.
        int temp = -1;
        for (int i2 = 0; i2 < arr.length; i2++) {
            for (int j = i2 + 1; j < arr.length; j++) {
                if (arr[i2] < arr[j]) {
                    temp = arr[i2];
                    arr[i2] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 5)배열에 있는 값을 이용하여 다시 정수를 만든다.
        int value = 0;
        if (arr.length > 0) {
            value = arr[0];
            if (arr.length > 1) {
                for (int i3 = 1; i3 < arr.length; i3++) {
                    value = value * 10 + arr[i3];
                }
            }
        }

        return value;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
