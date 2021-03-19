package chapter3;

import java.util.Scanner;

public class PracTics7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("첫번쨰 수를 입력하세요 :");
		int num1 = scanf.nextInt();
		
		System.out.println("두번쨰 수를 입력하세요 :");
		int num2 = scanf.nextInt();
		System.out.println("연산자를 입력하세요 :");
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
