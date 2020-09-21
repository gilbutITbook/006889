// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class LogicalOperatorExam{
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		// 이 아래 줄을 수정하세요.
		if(     ) {
			isTwenties = true;
		}else{
			isTwenties = false;
		}
    
    		return isTwenties; // 결과 테스트를 위한 코드입니다.
	}

	// 아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args){
		LogicalOperatorExam exam = new LogicalOperatorExam();
		System.out.println(exam.isAgeTwenties(19));
		System.out.println(exam.isAgeTwenties(25));
		System.out.println(exam.isAgeTwenties(30));
	}
}
