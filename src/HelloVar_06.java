
public class HelloVar_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǽ��� (�Ҽ��� ���� 6�ڸ� ���� �˷��ִ� Ű����)
		//float���� ����� ������ ���ڰ��� �����Ҷ���
		//���� �� �ҹ��� f�� �����ش�.
		float korScore = 90f;
		float engScore = 80f;
		float mathScore = 70f;
		
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		
		System.out.println("����:"+ sum);
		
		float avg = sum / 3;
		System.out.println("���:"+avg);

	}

}
