package chapter1;

import java.util.Scanner;

public class Prac9 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int kor = scanf.nextInt();
		boolean result = 0 <=kor && kor <= 100;
		
		String str = result ? "�ùٸ� �����Դϱ�?" : "�߸��� �����Դϴ�";
		System.out.println(str);
		
		System.out.println("=======");
		
		result = kor >= 50;
		
		str = result ? "pass" : "fail";
		
		System.out.println(str);
	}

}
