package chapter12;

public class Ex5 {
	
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		// 업캐스팅 / 형변환 연산자 생략 가능
		car = (Car) fe1;
		// 다운캐스팅 / 형변환 연산자 생략 불가능
		fe2 = (FireEngine) car;
		
		
		fe1.water();
		fe2.water();
	}

}
