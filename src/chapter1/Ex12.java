package chapter1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		 * �� ������ : ���� (true , false)�� �����ϱ� ���� ������
		 * && : �� �� ��� true �ϋ� �� ����� true // ������
		 * true -> �� , 1
		 * false -> ����, 0
		 * || : �� �� �� �ϳ��� true �� ����� true
		 * ! : true�� false��, false�� true �� ���� �ݴ�� ������ִ� ������
		 */
		
		/*
		 * ���� ��� ���α׷��� �����ϼ���.
		 * ���� ������ 0 ~ 100�� �����Դϴ�.
		 * ���� ������ �Է� �޾� ������ �������� ��ȯ���ּ���.
		 */
		// ������������ �����ͼ� ���α׷��� ����
		
		// Scanner ��� �ٷ��� : �Է��� ���� �������� ����� ���� ����
		// ��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���
		Scanner scanf = new Scanner(System.in);
		
		// ���ϱ׷��� ������� �˷��ش� ���������� �p�������� �˷��ش�
		System.out.println("�������� : ");
		// scanf ��ü�� �����ϴ� ����� �ż����� �θ���.
	 int kor =	scanf.nextInt();
	 System.out.println("kor =" +kor);
	 
	 // true , false �Ǵ� false ,true :0�� �̸� 100���� �ʰ��ϴ� ���������� �Է��ߴ�.
	 boolean right = (kor >= 0) && (kor <= 100);
	 System.out.println(right);
		
	}

}
