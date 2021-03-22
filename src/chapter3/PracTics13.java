package chapter3;

import java.util.Scanner;

public class PracTics13 {
	public static void main(String[] args) {
		// while문은 주로 조건 반복문(끝이 명확하지 않은)에 적합
		
		Scanner scanf = new Scanner(System.in);
		
		// 다시 음악을 재생할지 여부를 묻는다.
		char repeat = 'y';  
		
		// do 도 사용할수 있다.(활용빈도가 적다)
		// 실무에서 조건문에 true라고 쓰고 if와 break를 사용하여 조건문을 빠져나가도록 한다.
		while (true) {
			System.out.println("음악을 재생합니다");
		
		int number = 1; 
		while (number <= 10) {
			System.out.println(number +"트랙을 재생합니다");
			
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = scanf.next().charAt(0);
			if (repeat == 'y') {
				continue;
			}
			number = number + 1;
			}
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = scanf.next().charAt(0); // chatAt(0): String 타입으로 저장된 문자를 char변환해주는 기능을 가지고 있다
			if (repeat == 'y') {
				continue;
			}								// 위에서는 y라는 질문을 던지고 그 질문에 답을 하기 위해  문자열로 다시 입력하기 위해 이 기능을 추가하였다.
											 // 괄호 안에 있는 숫자는 인덱스 번호 이다 컴퓨터에서 숫자나 자리를 셀떄는 0부터 시작
			
			break; //break 속한 while문을 빠져 나간다.
		}
		scanf.close();
	}
	}

