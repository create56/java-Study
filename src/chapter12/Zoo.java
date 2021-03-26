package chapter12;

public class Zoo {

	public static void main(String[] args) {
		ZooKeeper james = new ZooKeeper();
		
		Animal animal1 = new Lion();
			
		Lion lion = new Lion();
		james.feed(lion);
		
		Rabbit rabbit = new Rabbit();
		james.feed(rabbit);
		
		Monkey monkey = new Monkey();
		james.feed(monkey);
		
			

	}

}
