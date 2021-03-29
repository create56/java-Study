package chapter13;

public abstract class Animal {
	private String name;
	private String hungry;
	// 배고픔 정도(0:매우배고품 , 10 배부름)
	
	public Animal() {
		this("animal");
	}
	
	public Animal(String name) {
		this.name = name;
	
	}
	
	public String getMyName() {
		return name;
	}
	
	public void run() {
	
	}
	public abstract void findfood();
	public abstract void eatfood();
	
	// 동물들은 배고플떄 음식을 찾아서 먹으므로
	// eat 메서드를 사용해서 배고프다면 (if(hungry <= 5))
	// 음식을 찾고 먹도록 구현하였다
	// 이떄, 동물들 마다 음식을 찾는 방식이 다 다르므로 findfood 매서드는 추상매서드로 선언
	// 동물들 마다 음식을 먹는 방식을 다 다르므로 eatfood매서드는 추상메서드로 선언
	public void eat() {
		if (hungry <= 5) {
			findfood();
			// 음식을 찾는다
			
			// 음식을 먹는다
			System.out.println("음식을 먹습니다");
		}
	}
}
