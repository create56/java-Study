package chapter3;

import java.util.Scanner;

public class PracTics13 {
	public static void main(String[] args) {
		// while���� �ַ� ���� �ݺ���(���� ��Ȯ���� ����)�� ����
		
		Scanner scanf = new Scanner(System.in);
		
		// �ٽ� ������ ������� ���θ� ���´�.
		char repeat = 'y';  
		
		// do �� ����Ҽ� �ִ�.(Ȱ��󵵰� ����)
		// �ǹ����� ���ǹ��� true��� ���� if�� break�� ����Ͽ� ���ǹ��� ������������ �Ѵ�.
		while (true) {
			System.out.println("������ ����մϴ�");
		
		int number = 1; 
		while (number <= 10) {
			System.out.println(number +"Ʈ���� ����մϴ�");
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			if (repeat == 'y') {
				continue;
			}
			number = number + 1;
			}
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0); // chatAt(0): String Ÿ������ ����� ���ڸ� char��ȯ���ִ� ����� ������ �ִ�
			if (repeat == 'y') {
				continue;
			}								// �������� y��� ������ ������ �� ������ ���� �ϱ� ����  ���ڿ��� �ٽ� �Է��ϱ� ���� �� ����� �߰��Ͽ���.
											 // ��ȣ �ȿ� �ִ� ���ڴ� �ε��� ��ȣ �̴� ��ǻ�Ϳ��� ���ڳ� �ڸ��� ������ 0���� ����
			
			break; //break ���� while���� ���� ������.
		}
		scanf.close();
	}
	}

