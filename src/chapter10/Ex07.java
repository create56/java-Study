package chapter10;

public class Ex07 {
	// int add -> 메서드가 동작하고 나서 만들어 내는 결과값이 정수 타입이라는것
	// add-> 매서드의 이름
	// () 매개변수가 필요없는 메서드
	
	// 반환타입
	// 정수 : byte , int ,short , long
	// 실수 : float , double
	// 문자 : char
	// 문자열 : String
	int add() {
		int  result = 1 + 1;
		
		return result;
	}
	public static void main(String[] args) {
	Ex07 ex07 = new Ex07();
	
	int result = ex07.add();
	System.out.println(result);

	}

}
