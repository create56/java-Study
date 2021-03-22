package chapter3;

public class PracTics8 {
	public static void main(String[] args) {
	int book = 3;
	
	if (book >=0) {
		switch (book) {
		case 0:
			System.out.println("0 <= book && book > 10(조금 더 읽으시는게 좋겠어요!");
			break;
		case 1: 
			System.out.println("한권이나 읽으셨군요!");
			break;
		case 2:	
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default:
			//1년동안 세권이상 읽었을 경우
			System.out.println("다독왕입니다!");
			break;
		
	    }
	  } 
	}

}
