package chapter1;

public class Prac1 {

	public static void main(String[] args) {
		double num1 = 3.14;
		System.out.println(num1);
		char num2 = 'z';
		System.out.println(num2);
		boolean num3 = false;
		System.out.println(num3);
		int num = 100;
		System.out.println(num);
		
		// 변수명은 한글도 되지만 권장하지는 않음
		// 변수명은 영문자, 숫자 특수문자($,_) 만 사용할수 있다.
		int word;
		int word1;
		int word$;
		int word_;
		
		//변수명의 시작은 영문자, 특수문자만 가능하다.
		int _word;
		int $word;
		
		// 변수명은 영문자를 구분한다
//		int apple = 17;
//		int Apple = 27;
		
		// 변수명은 키워드를 사용할수 없습니다.
		// 키워드 - 영단어이기는 하지만 자바가 미리 선점한 영단어
		// 변수는 중복해서 선언할수 없다
		int apple1= 17;
		int apple2= 27;
		
		// 카멜표기법(낙타 표기법)
		int myAge;
		
		char myGrade;
		
		
		
	}

}
