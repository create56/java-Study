package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		
		//(1�鸸)
		numbers.num1 = 1_000_000;
		numbers.num2 = numbers.num1;
		
		//�����÷ο� ����
		//1��� * 1��� = 
		long var = (long) numbers.num1 * numbers.num2;
		System.out.println(var);
	}

}
