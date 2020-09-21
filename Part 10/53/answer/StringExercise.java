// 정답 코드입니다

package javaStudy;

public class StringExercise {

    String getMiddle(String word) {
        String middleWord = "";
        int index = word.length() / 2;
        if (word.length() % 2 == 0) {
            middleWord = word.substring(index - 1, index + 1);
        } else {
            middleWord = word.substring(index, index + 1);
        }

        return middleWord;
    }

    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}
