package chapter3;

import java.util.Scanner;

public class PracTics15 {

	public static void main(String[] args) {
		// �Ʒ��� ���� �� ���� �Է� �޾� ���� ����ϼ���
		
		/*
		 *  �� �� : (�Է�) 3   �ټ� : 5 �ټ� : 7
		 */  
		  //
		Scanner scannner = new Scanner(System.in);
		System.out.print("�� ��:");
		 int row = scannner.nextInt();
		 
		for (int i = 1; i <= row; i++) { // �ټ��� ����
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		 
	}

}
