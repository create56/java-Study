package chapter3;

public class Ex12 {

	public static void main(String[] args) {
	System.out.println("구구단 2단....");
	
	// j가 2일떄 i가 1~9까지
	// j가 3일떄 i가 1~9까지 
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