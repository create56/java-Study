package chapter10;

public class Ex05 {

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		
		int num1 = 10;
		System.out.println("before :" + num1);
		ex05.change(num1);
		System.out.println("after :" + num1);
		System.out.println();
		
		SimpleType1 type = new SimpleType1();
		type.num1 = 10;
		
		System.out.println("before :" + num1);
		ex05.change(type);
		System.out.println("after :" + num1);

	}
	
	void change(int num1) {
		num1 = num1 * 10;
		System.out.println("change(int) :" + num1);
	}
	
	void change(SimpleType1 type) {
		type.num1 = type.num1 * 10;
		
		System.out.println("change(SimpleType1) :" + type.num1);
	}

}
