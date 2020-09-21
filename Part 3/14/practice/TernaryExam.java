// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

import java.util.Calendar;

public class TernaryExam {

    public static void main(String[] args) {
        // hour에는 현재 시간이 24시간 단위로 들어 있습니다.
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항 연산자를 이용해서 ampm에 오전 또는 오후의 값을 가지도록 만들어 보세요.
        ampm =
            System.out.println(
                "지금 시간은 " + hour + "시이고, " + ampm + "입니다."
            );
    }
}
