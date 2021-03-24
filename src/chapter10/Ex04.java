package chapter10;

public class Ex04 {
	// simple1 메서드는 정수 1개가 필요한 메서드
	void simple1(int val) {
		System.out.println(val);
}
	void simple2() {
		System.out.println("Hello World");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	// simple4 메서드는 정수 2개가 필요한 메서드
	void simple4(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			 System.out.println(num2);
		}
	}
	
	 void simple5(int var1, int var2, char var3) {
		 if (var3 == '+') {
			System.out.println(var1 + var2);
		} else if (var3 == '-'){
			System.out.println(var1 - var2);
		}
	 }
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		
		ex04.simple1(1); // (1) 인자라고 하고, 인자값을 복사해서 올라간다 class Ex04으로 
		ex04.simple2();
		ex04.simple2();
		ex04.simple2();
		ex04.simple2();
		
		ex04.simple3("Hello World");
		ex04.simple3("안녕하세요");
		
		ex04.simple5(1, 1, '+');

	}

}
