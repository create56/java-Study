package chapter3;

public class PracTics9 {

	public static void main(String[] args) {
		// switch���� ���� ������ �� �� ������ �����⸦ ���ؼ� ���� ������ ����
		int book = 13;
		book = book / 10;
		
		
		if (book >=0) {
			switch (book) {
			case 0:
				System.out.println("���� �� �����ô°� ���ھ��!");
				break;
			case 1: 
				System.out.println("�ѱ��̳� �����̱���!");
				break;
			case 2:	
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
			case 3:
				System.out.println("å ���Ͼ� �Դϴ�");
			
			default:
				//1�⵿�� �����̻� �о��� ���
				System.out.println("����� �ٵ����Դϴ�!");
				break;
			
		    }
		  } 
	}

}
