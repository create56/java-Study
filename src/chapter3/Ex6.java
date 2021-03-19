package chapter3;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		Scanner scanf= new Scanner(System.in);

		System.out.print("2021년 3월의 날짜");
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayofMonth % Ex6.Week;
		
		System.out.println("2021년 3월 " + dayOfMonth + "일은");
		
		if (dayOfweek == 0)
			System.out.println("일요일");
			
		}
			
		
	}

}
