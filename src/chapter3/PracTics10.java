package chapter3;

public class PracTics10 {

	public static void main(String[] args) {
		int num = 11;
		num = num % 2;
		
		switch (num) {
		case 0:
			System.out.println("¦��");
			break;

		case 1:
			System.out.println("Ȧ��");
			
		}
		
		// Ư�� ���� ���
		int dayOfMonth = 28;
		int dayOfWeek = dayOfMonth & 7;
		
		// ���̽��ѿ� ������� �� �ʿ�� ����!!
		switch (dayOfWeek) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
		case 3:
			System.out.println("������");
		case 4:
			System.out.println("�����");
		case 5:
			System.out.println("�ݿ���");			
		case 6:
			System.out.println("�����");
			break;
		default:
			System.out.println("�Ͽ���");
			break;
		}
	}

}
