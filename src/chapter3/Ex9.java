package chapter3;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ù���� �� :");
		int num1 = scanf.nextInt();
		
		System.out.println("�ι��� �� :");
		int num2 = scanf.nextInt();
		
		System.out.println("������ :");
		String opertor = scanf.next();
		
		switch (opertor) {
		case "+":
			System.out.println(num1 + "+" +num2+ "=" + (num1 + num2));
			break;
		case "-" :
			System.out.println(num1 + "+" +num2+ "=" + (num1 - num2));
			break;
		default:
			System.out.println("+, -, *, / �� �Է��ϽǼ� �ֽ��ϴ�");
			break;
		}
	}

}
