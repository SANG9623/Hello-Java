
public class HelloVar_04 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		num =50;
		System.out.println(num);
		//상위에 키워드(int)가 존재할경우 하위에 있는 기억장치는 키워드(int)가 존재하지 않아도 
		//console에 보여짐.
		
		int num1 =30;
		num1 =40;
		System.out.println("2:"+num1);
		num1 =0;
		System.out.println("1:"+num1);
		
		num1 =100;
		num1 =50;
		System.out.println("4:"+num1);
		System.out.println("3:"+num1);
		
		
		
	}

}
