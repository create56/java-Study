package chapter3;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		Scanner scanf= new Scanner(System.in);

		System.out.print("2021�� 3���� ��¥");
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % Ex6.Week;
		
		System.out.println("2021�� 3�� " + dayOfMonth + "����");
		
		if (dayOfWeek == 0)
			System.out.println("�Ͽ���");
			
		}
			
		
	}

}
