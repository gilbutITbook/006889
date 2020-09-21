// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
    }
}

enum Gender {
    MALE,
    FEMALE,
}
