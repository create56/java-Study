package chapter3;

import java.util.Scanner;

public class PracTics7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ù���� ���� �Է��ϼ��� :");
		int num1 = scanf.nextInt();
		
		System.out.println("�ι��� ���� �Է��ϼ��� :");
		int num2 = scanf.nextInt();
		System.out.println("�����ڸ� �Է��ϼ��� :");
		String opertor = scanf.next();
		
		if (opertor.equals("+")) {
			System.out.println(num1 + num2);
		} else if (opertor.equals("-")) {
			System.out.println(num1 - num2);
		} else if (opertor.equals("*")) {
			System.out.println(num1 * num2);
		} else if (opertor.equals("/")) {
			System.out.println(num1 / (double) num2);
		}
		

	}

}
