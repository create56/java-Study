package chapter10;

public class Ex09 {
	// �� add�ż���� �̸��� ������ �Ű������� �ٸ��Ƿ� 
	// �����ε��� �ż����̴�.
	
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	double add(double num3 ,double num4) {
		return num3 + num4;
	}
	
	double add(int num5, double num6 ) {
		return num5 + num6;
	}
	
	int num1;
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("�ν��Ͻ� �ɹ� �޼���");
	}
	
	static void classmemberMethod() {
		System.out.println("Ŭ���� �ɹ� ����");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex09 = new Ex09();
		
		ex09.instanceMemberMethod();
		ex09.classmemberMethod();

	}
}