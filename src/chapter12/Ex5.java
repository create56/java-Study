package chapter12;

public class Ex5 {
	
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		// ��ĳ���� / ����ȯ ������ ���� ����
		car = (Car) fe1;
		// �ٿ�ĳ���� / ����ȯ ������ ���� �Ұ���
		fe2 = (FireEngine) car;
		
		
		fe1.water();
		fe2.water();
	}

}
