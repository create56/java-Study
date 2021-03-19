package chapter2;

public class Ex16 {

	public static void main(String[] args) {
		// 변수
		int num1 = 10;
		num1 =  10;

		// 상수 : 변하면 안되는 데이터가 있을 경우
		// 기준이 되는 값(final)
		//ex)원주율,특정시점에 우리나라의 땅의 크기
		final int num2 = 10;
		
		final double PI = 3.14;
		
				
		num1 = num1 * num2;
		System.out.println(num2);
	
	}

}
