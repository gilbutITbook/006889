// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

import java.util.Calendar;

public class SwitchExam {

    public static void main(String[] args) {
        // month에는 현재 월이 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch 문을 이용해서 season이 봄/여름/가을/겨울 중 하나의 값을 가지도록 만들어 보세요.

        // 이 위에서 switch 문을 완료해야 합니다.
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
}
