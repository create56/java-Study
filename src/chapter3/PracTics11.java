package chapter3;

import java.util.Scanner;

public class PracTics11 {
	public static void main(String[] args) {
		// 자판기 문제
	Scanner scanf = new Scanner(System.in);
	
	System.out.println("코리아 IT자판기");
	System.out.println("1. 콜라");
	System.out.println("2. 환타");
	System.out.println("3. 사이다");
	System.out.println("4. 마운틴듀");
	System.out.println("자판기의 버튼을 누르세요 :");
	
	int button = scanf.nextInt();
	
	// 케이스 1~3번까지 내려와서 3번에 있는 콜라를 출력한다
	switch (button) {
	case 1:
	case 2:
	case 3:
		System.out.println("콜라");
		break;
	case 4:
		System.out.println("환타");
		break;
	case 5: 
	case 6:
		System.out.println("사이다");
		break;
	case 7:
		System.out.println("마운틴듀");
		break;
	default:
		System.out.println("1~7번만 누를 수있습니다"); // 번호를 잘못 누를수 있는 경우에 작용하는 예외사항
	
 	  }
	}
}
