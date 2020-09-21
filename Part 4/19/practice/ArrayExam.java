// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

public class ArrayExam{
	
	public int[] makeArray(){
		// array가 1부터 5까지 값을 가지는 길이가 5인 int 배열이 되도록 만들어 보세요.
		int [] array =                

		// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
		return array;
	}

	// 아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[]args){
		ArrayExam exam = new ArrayExam();
		int [] array = exam.makeArray();
		if(array.length==5 &&
			array[0] ==1 &&
			array[1] ==2 &&
			array[2] ==3 &&
			array[3] ==4 &&
			array[4] ==5){
			System.out.println("정답입니다.");
		}
		else{
			System.out.println("틀렸습니다.");
		}
	}
}

