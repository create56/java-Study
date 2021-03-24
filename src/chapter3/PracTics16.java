package chapter3;

import java.util.Scanner;

public class PracTics16 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("문자열 입력 :");
		String input = scanf.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char monja = input.charAt(i);
			
			if (monja != ' ') {
				System.out.print(monja);
			}
			
		}
		
		
	}

}
