package chapter11;

public class Ex2 {
	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		
		Ex1 obj2 = new Ex1();
		obj2.num1 = 1;
		obj2.num2 = 3.14;
		obj2.num3 = 'a';
		obj2.num4 = "Hello";
		
		obj2.func1();
		obj2.func2(0);
		obj2.func3();
		obj2.func4(0);
		
		
	}

}
