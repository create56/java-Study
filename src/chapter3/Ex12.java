package chapter3;

public class Ex12 {

	public static void main(String[] args) {
	System.out.println("������ 2��....");
	
	// j�� 2�ϋ� i�� 1~9����
	// j�� 3�ϋ� i�� 1~9���� 
	int j = 2;
	while (j <= 5) {
		int i = 1;
	
		
		while ( i <= 9) {
			System.out.println(j + "*" +i+ "=" + (j*i));
			i += 1;
		}
		j= j+1;
		
	}
	}
}