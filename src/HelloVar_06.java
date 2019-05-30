
public class HelloVar_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수형 (소수점 이하 6자리 까지 알려주는 키워드)
		//float으로 선언된 변수에 숫자값을 대입할때는
		//끝에 영 소문자 f를 붙혀준다.
		float korScore = 90f;
		float engScore = 80f;
		float mathScore = 70f;
		
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		
		System.out.println("총점:"+ sum);
		
		float avg = sum / 3;
		System.out.println("평균:"+avg);

	}

}
