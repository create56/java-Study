package chapter3;

public class Ex13 {

	public static void main(String[] args) {	
		// �ʱ�� �ڸ��� ������ ������ for �������� ����
		// ���� ���� : �ʱ�� ������ ���ǽ� ������ ����
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

