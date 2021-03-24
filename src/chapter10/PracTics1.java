package chapter10;

import java.util.Scanner;

public class PracTics1 {
	void Math(int var1,int var2) {
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " +i+ "=" + 2*i);
			
		}
	}
	//좋은 매서드 한번에 한동작만 할수 있도록
	void Math2(int gugu) {
		if (gugu == 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.println("3 * " +i+ "=" + 3*i);
			}
		}
			
		
		}
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("출력할 구구단(2~9단) :");
		int gugu = scanf.nextInt();	

	}

}
