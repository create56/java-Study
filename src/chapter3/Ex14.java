package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		for (int i = 0; i < number.length(); i++) {
			System.out.println(number.charAt(i));
		}
		
		String a ="Sfasfqafsad";
		System.out.println(a.length()); // 문자의 길이를 알수 있다
		for (int i = 0; i < a.length(); i++) {
			char monja = a.charAt(i);
			
			if (monja == 'a') {
				System.out.println(monja);
			}
		}
		// for문을 사용해서 a 객체에 들어있는 문자열에
		// 처음부터 끝까지 접근해서 출력하세요
		
	}

}
