package chapter1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		 * 논리 연산자 : 논리값 (true , false)를 연산하기 위한 연산자
		 * && : 두 값 모두 true 일떄 만 결과가 true // 논리곱셈
		 * true -> 참 , 1
		 * false -> 거짓, 0
		 * || : 두 값 중 하나만 true 면 결과가 true
		 * ! : true를 false로, false를 true 로 값을 반대로 만들어주는 연산자
		 */
		
		/*
		 * 성적 계산 프로그램을 개발하세요.
		 * 국어 성적은 0 ~ 100점 사이입니다.
		 * 국어 성적을 입력 받아 적절한 학점으로 변환해주세요.
		 */
		// 웹페이지에서 가져와서 프로그램을 개발
		
		// Scanner 기능 꾸러미 : 입력을 위한 여러가지 기능을 갖고 있음
		// 기능 꾸러미를 사용하려면 구체화를 시켜야함
		Scanner scanf = new Scanner(System.in);
		
		// 프록그램의 사용방법을 알려준다 국어점수는 몆점인지를 알려준다
		System.out.println("국어점수 : ");
		// scanf 객체가 제공하는 기능을 매서드라고 부른다.
	 int kor =	scanf.nextInt();
	 System.out.println("kor =" +kor);
	 
	 // true , false 또는 false ,true :0점 미만 100점을 초과하는 국어점수를 입력했다.
	 boolean right = (kor >= 0) && (kor <= 100);
	 System.out.println(right);
		
	}

}
