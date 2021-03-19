package chapter3;

import java.util.Scanner;

public class PracTics5 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("성적입력 (0 <= x <= 100 :");
		int grade = scanf.nextInt();
		
		
		if (90 >= grade) {
			System.out.println("A");	
		} else if (80 >= grade ) {
			System.out.println("B");
		} else if (70 >= grade) {
			System.out.println("C");
		} else if (60 >= grade) {
			System.out.println("D");
		}
		
		
	}

}
