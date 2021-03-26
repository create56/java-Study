package chapter12;

public class Ex7 {

	public static void main(String[] args) {
		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요
		Product[] fruitShelf = new Product[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
		fruitShelf[2] = new Onion();
		
		Product[] vegetableShelf = new Product[3];
		vegetableShelf[0] = new Onion();
		
		Product[] basket = new Product[3];
		basket[0] = new Apple();
		basket[0] = new Banana();
		basket[0] = new Onion();
		
		
	}

}
