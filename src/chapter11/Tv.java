package chapter11;

// Tv매서드
public class Tv {
	public static void main(String[] args) {
	// 외부로 공개하면 안되는 데이터를 감추는 것을 캡슐화, 정보은닉
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	// 객체지향은 데이터들을 갖고 있을 객체를 생각해야하고
	// 객체가 제공하는 기능을 설계해야하므로
	// 프로젝트 개발 기간이 길어지는 단점이 있음
	// 프로젝트의 규모가 커지면 점점 복잡해짐
	// 프로젝트를 객체지향적으로 제대로 설계를 해두면
	// 유지보수 속도가 굉장히 빠르다.
	
	// 프로시져지향은 데이터만 생각하면 되므로
	// 프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
	// 프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
	// 유지보수 속도가 굉장히 느려진다.
	public Tv() {
		color = "검정";
		power = false;
		channel = 1;
	}
	public Tv(String color) {
		this.color = color;
	}
	
	public Tv(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	public String getColor() {
 		return color;
 	}
 	public boolean getpPower() {
 		return power;
 	}
	
	public int getChannel() {
		return channel;
	}
	
	// 좋은 메서드 - 한번에 하나의 기능만 제공하는 메서드
	// 1.전원을 켜고
	// 2.현재 채널 번호를 알려준다.
	void power() {
		power = !power;
		if (power) {
			System.out.println("전원을 켰습니다");
		} else {
			System.out.println("전원을 껐습니다");
		} 
	}
	
	void channalUp() {
		channel++;
		showChannel();
	}
	void channelDown() {
		channel--;
		
		showChannel();
	
	}
	public voids showChannel() {
		System.out.println("현재의 " +channel+ "입니다");
	  
	}
	
	
	}

}
