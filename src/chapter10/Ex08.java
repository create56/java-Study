package chapter10;

public class Ex08 {
	int add(int num1 ,int num2) {
		int result = num1 + num2;
		
		return result;
		
}
	// �μ��� ���� �������� ��ȯ�ϴ� �޼��� ����
	int div(int num1 , int num2) {
		return num1 % num2;
	}
	// 1~N������ �������� ��ȯ�ϴ� stackAdd�޼��� ����
	// ����(N�� 0~100����
	int stackAdd(int n) {
		if (n < 0 || n > 100) {
			System.out.println("n�� 0�̻� 100���ϸ� �����մϴ�");
			
			return -1;
		}
		
		int add = 0;
		for (int i = 1; i <= n; i++) {
			add = add + n;
		}
		return add;
	}
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		
		int result = ex08.add(1, 1);
		System.out.println(result);

	}

}
