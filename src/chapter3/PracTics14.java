package chapter3;

public class PracTics14 {

	public static void main(String[] args) {
//		factorial - ��������
//		1! = 1 
//		n! = n *(n-1)!
//		3! = 3 * 2 * 1
//		5! = 5 * 4 * 3 * 2 * 1 
		
		// n!�� �ݺ����� ����ؼ� ���ϼ���!
//		
//		int n = 10;
//		int sum = 1;
//		for (int i=n; i>=1; i--) {
//			sum = sum * i;
//			
//		}
//		System.out.println("������ ��� = " + sum);
		
		// 1���� 10���� �ϳ���  for������ Ȧ�� ,¦���� ���� ���ϼ���.
		
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum1 += i;
			}
			System.out.println("¦���� �� =" +sum);
			System.out.println("Ȧ���� �� =" +sum1);
		}
	}

}
