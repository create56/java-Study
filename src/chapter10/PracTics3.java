package chapter10;

public class PracTics3 {
	// 36 % 5�� ����� �Ǽ� ������ ��ȯ�ϴ� div �޼��� ����
	double div() {
		int result = 36 % 5;
		
		return  result;
	}
	
	// 1~5������ ���� ���� ������ ��ȯ�ϴ� stackAdd �޼��� ����
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
