package chapter13;

public class Lion extends Animal{
	public Lion() {
		super("사자");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + " 이(가)두발로 달립니다");
		
	}

	@Override
	public void findfood() {
		// TODO Auto-generated method stub
		System.out.println("사냥감을 쫒아가 잡았습니다");
	}

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub
		System.out.println("사냥감을 와구와구 먹었습니다");
	}
	
	
}
