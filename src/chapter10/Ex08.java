package chapter10;

public class Ex08 {
	int add(int num1 ,int num2) {
		int result = num1 + num2;
		
		return result;
		
}
	// 두수를 나눈 나머지를 반환하는 메서드 선언
	int div(int num1 , int num2) {
		return num1 % num2;
	}
	// 1~N까지의 누적합을 반환하는 stackAdd메서드 선언
	// 조건(N은 0~100이하
	int stackAdd(int n) {
		if (n < 0 || n > 100) {
			System.out.println("n은 0이상 100이하만 가능합니다");
			
			return -1;
		}
		
		int add = 0;
		for (int i = 1; i <= n; i++) {
			add = add + n;
		}
		return add;
	}
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		
		int result = ex08.add(1, 1);
		System.out.println(result);

	}

}
