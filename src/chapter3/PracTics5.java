package chapter3;

import java.util.Scanner;

public class PracTics5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		System.out.println("������ �Է��ϼ��� >");
		Scanner scanf = new Scanner(System.in);
		score = scanf.nextInt();
		
		if (score >= 90) {
			grade = 'A'; 	
		} else if (score >= 80 ) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score < 60) {
			grade = 'D';
		} else {
			grade= 'F';
		}
		System.out.println("����� ������"+grade+"�Դϴ�");
		
	}

}
