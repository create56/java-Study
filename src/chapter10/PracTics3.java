package chapter10;

public class PracTics3 {
	// 36 % 5의 결과를 실수 값으로 반환하는 div 메서드 선언
	double div() {
		int result = 36 % 5;
		
		return  result;
	}
	
	// 1~5까지의 누적 합을 정수로 반환하는 stackAdd 메서드 선언
	int stackAdd() {
		int add = 0;
		for (int i = 1; i <=5; i++) {
			add += i;
		}
		return add;
	}
	public static void main(String[] args) {
		PracTics3 practics3 = new PracTics3();
		
		int result = practics3.div();
		
		
	}

}
