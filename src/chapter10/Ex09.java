package chapter10;

public class Ex09 {
	// 세 add매서드는 이름은 같지만 매개변수가 다르므로 
	// 오버로딩된 매서드이다.
	
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	double add(double num3 ,double num4) {
		return num3 + num4;
	}
	
	double add(int num5, double num6 ) {
		return num5 + num6;
	}
	
	int num1;
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("인스턴스 맴버 메서드");
	}
	
	static void classmemberMethod() {
		System.out.println("클래스 맴버 변수");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex09 = new Ex09();
		
		ex09.instanceMemberMethod();
		ex09.classmemberMethod();

	}
}