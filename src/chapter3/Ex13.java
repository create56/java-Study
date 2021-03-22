package chapter3;

public class Ex13 {

	public static void main(String[] args) {	
		// 초기식 자리에 선언한 변수는 for 문에서만 가능
		// 실행 순서 : 초기식 증감식 조건식 순으로 실해
//		for (int i = 1; i <= 10; i++) {
//		System.out.println(i);
//		}
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			int su = i % 2;
//			if (su == 1) sum +=i; 
//				
//			}
//	    	System.out.println(sum);
		
		int sum = 0;
		for (int i = 2; i <= 10; i + 2) {
			sum += i;
		
		System.out.println(sum);
		}
	}
}

