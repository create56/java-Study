package chapter3;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("첫번쨰 수 :");
		int num1 = scanf.nextInt();
		
		System.out.println("두번쨰 수 :");
		int num2 = scanf.nextInt();
		
		System.out.println("연산자 :");
		String opertor = scanf.next();
		
		switch (opertor) {
		case "+":
			System.out.println(num1 + "+" +num2+ "=" + (num1 + num2));
			break;
		case "-" :
			System.out.println(num1 + "+" +num2+ "=" + (num1 - num2));
			break;
		default:
			System.out.println("+, -, *, / 만 입력하실수 있습니다");
			break;
		}
	}

}
