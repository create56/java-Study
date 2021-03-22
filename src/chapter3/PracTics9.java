package chapter3;

public class PracTics9 {

	public static void main(String[] args) {
		// switch문은 범위 지정을 할 수 없지만 나누기를 통해서 범위 지정이 가능
		int book = 13;
		book = book / 10;
		
		
		if (book >=0) {
			switch (book) {
			case 0:
				System.out.println("조금 더 읽으시는게 좋겠어요!");
				break;
			case 1: 
				System.out.println("한권이나 읽으셨군요!");
				break;
			case 2:	
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			case 3:
				System.out.println("책 마니아 입니다");
			
			default:
				//1년동안 세권이상 읽었을 경우
				System.out.println("당신은 다독왕입니다!");
				break;
			
		    }
		  } 
	}

}
