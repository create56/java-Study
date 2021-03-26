package chapter12;

// 3차원의 한점을 표현하기 위한 클래스
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	
	// this와 마찬가지로 super 붙이지 않고 메서드를 호출

	@Override // annotation : 주석(컴퓨터에게 알려주는 주석)
	public String getLocation() {
		return super.getLocation() + ", z :" + z; // super : 부모의 라는 뜻
		// this를 쓴거 처럼 위에 정의해놓은 매서드를 반복한다.
	} 

	
		
	// 오버라이딩 : 부모 클래스에 정의되어있는 메서드를 자식 클래스에서 재정의하는 것
	
	
}
