package chapter3;

import java.util.Scanner;

public class PracTics15 {

	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별을 출력하세요
		
		/*
		 *  줄 수 : (입력) 3   줄수 : 5 줄수 : 7
		 */  
		  //
		Scanner scannner = new Scanner(System.in);
		System.out.print("줄 수:");
		 int row = scannner.nextInt();
		 
		for (int i = 1; i <= row; i++) { // 줄수를 관리
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		 
	}

}
