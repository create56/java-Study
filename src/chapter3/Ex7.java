package chapter3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String a = "+";
		
		String b = scanf.next();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a.equals(b)) {
			System.out.println("a�� b�� �����ϴ�"); 
		} else {
			System.out.println("a�� b�� �ٸ��ϴ�");
		}
	}

}
