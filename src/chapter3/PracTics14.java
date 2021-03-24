package chapter3;

public class PracTics14 {

	public static void main(String[] args) {
//		factorial - 순차곱셈
//		1! = 1 
//		n! = n *(n-1)!
//		3! = 3 * 2 * 1
//		5! = 5 * 4 * 3 * 2 * 1 
		
		// n!을 반복문을 사용해서 구하세요!
//		
//		int n = 10;
//		int sum = 1;
//		for (int i=n; i>=1; i--) {
//			sum = sum * i;
//			
//		}
//		System.out.println("순차곱 결과 = " + sum);
		
		// 1부터 10까지 하나의  for문에서 홀수 ,짝수의 합을 구하세요.
		
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum1 += i;
			}
			System.out.println("짝수의 합 =" +sum);
			System.out.println("홀수의 합 =" +sum1);
		}
	}

}
