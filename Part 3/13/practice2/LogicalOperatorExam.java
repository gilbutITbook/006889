// �ǽ� �ڵ带 �Ұ��� �����Դϴ�.
// ������ ���Ե��� �ʾ� �������� ���� ������
// �ݵ�� ������ Ȯ�� �� �ڵ带 �����Ͽ� �������ϱ� �ٶ��ϴ�.

public class LogicalOperatorExam{
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		// �� �Ʒ� ���� �����ϼ���.
		if(     ) {
			isTwenties = true;
		}else{
			isTwenties = false;
		}
    
    		return isTwenties; // ��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
	}

	// �Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	public static void main(String[] args){
		LogicalOperatorExam exam = new LogicalOperatorExam();
		System.out.println(exam.isAgeTwenties(19));
		System.out.println(exam.isAgeTwenties(25));
		System.out.println(exam.isAgeTwenties(30));
	}
}
