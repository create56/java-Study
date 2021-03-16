package chapter1;

public class Prac5 {

	public static void main(String[] args) {
		// 실수에서 정수로
		// 다운캐스팅
		// 값의 변화 있음
		double a = 1.1414;
		int b = (int) a;
		System.out.println(b);
		
		// 정수에서 실수로
		// 업 캐스팅
		// 값의 변화 없음
		int c = 1;
		double d = (double) c;
		System.out.println(d);
		// 문자를 정수로
		// 업 캐스팅
		// 값의 변화 없음
		char e = 'A';
		int f = (int) e;
		System.out.println(f);
		// 정수를 문자로
		// 다운캐스팅
		// 값의 변경있음
		int g = 100;
		char h = (char) g;
		System.out.println(h);
	}

}
