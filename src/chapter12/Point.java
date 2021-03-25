package chapter12;

public class Point {
	private int x;
	private int y;
	
	public String getLocation() {
		// 2차원의 한점을 좌표를 문자열로 반환
		return "x : " + x + ", y: " + y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
