package chapter3;

import java.util.Scanner;

public class PracTics11 {
	public static void main(String[] args) {
		// ���Ǳ� ����
	Scanner scanf = new Scanner(System.in);
	
	System.out.println("�ڸ��� IT���Ǳ�");
	System.out.println("1. �ݶ�");
	System.out.println("2. ȯŸ");
	System.out.println("3. ���̴�");
	System.out.println("4. ����ƾ��");
	System.out.println("���Ǳ��� ��ư�� �������� :");
	
	int button = scanf.nextInt();
	
	// ���̽� 1~3������ �����ͼ� 3���� �ִ� �ݶ� ����Ѵ�
	switch (button) {
	case 1:
	case 2:
	case 3:
		System.out.println("�ݶ�");
		break;
	case 4:
		System.out.println("ȯŸ");
		break;
	case 5: 
	case 6:
		System.out.println("���̴�");
		break;
	case 7:
		System.out.println("����ƾ��");
		break;
	default:
		System.out.println("1~7���� ���� ���ֽ��ϴ�"); // ��ȣ�� �߸� ������ �ִ� ��쿡 �ۿ��ϴ� ���ܻ���
	
 	  }
	}
}
