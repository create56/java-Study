package chapter3;

public class PracTics10 {

	public static void main(String[] args) {
		int num = 11;
		num = num % 2;
		
		switch (num) {
		case 0:
			System.out.println("짝수");
			break;

		case 1:
			System.out.println("홀수");
			
		}
		
		// 특정 요일 출력
		int dayOfMonth = 28;
		int dayOfWeek = dayOfMonth & 7;
		
		// 케이스둘울 순서대로 할 필요는 없다!!
		switch (dayOfWeek) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
		case 3:
			System.out.println("수요일");
		case 4:
			System.out.println("목요일");
		case 5:
			System.out.println("금요일");			
		case 6:
			System.out.println("토요일");
			break;
		default:
			System.out.println("일요일");
			break;
		}
	}

}
