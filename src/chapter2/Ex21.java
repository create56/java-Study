package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		
		//(1백만)
		numbers.num1 = 1_000_000;
		numbers.num2 = numbers.num1;
		
		//오버플로우 현상
		//1백반 * 1백반 = 
		long var = (long) numbers.num1 * numbers.num2;
		System.out.println(var);
	}

}
