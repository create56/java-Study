package chapter12;

public class Ex2 {
	public static void main(String[] args) {
		Parent2 parent2 = new Parent2();
		
		System.out.println(parent2.num);
		
		parent2.setNum(10);
		System.out.println(parent2.getNum());
		System.out.println("===============");
		
		Child2 child2 = new Child2();
		
		System.out.println(child2.num);

	}

}
