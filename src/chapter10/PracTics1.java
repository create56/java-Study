package chapter10;

import java.util.Scanner;

public class PracTics1 {
	void Math(int var1,int var2) {
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " +i+ "=" + 2*i);
			
		}
	}
	//���� �ż��� �ѹ��� �ѵ��۸� �Ҽ� �ֵ���
	void Math2(int gugu) {
		if (gugu == 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.println("3 * " +i+ "=" + 3*i);
			}
		}
			
		
		}
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("����� ������(2~9��) :");
		int gugu = scanf.nextInt();	

	}

}
