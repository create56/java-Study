package chapter12;

public class Ex6 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof object);
		
		Car car = new Car();
		System.out.println(car instanceof FireEngine);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof object);
		
		
	
	}

}
