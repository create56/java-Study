package chapter1;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char monja = 'A';
		int num = 20;
		double fNum = 17.3149;
								
		// 문자를 정수로 변환(업캐스팅)
		int num2 = monja;
		
		// 업캐스팅
		float fNum2 = num;
		
		char var = (char)num;
		
		int sum = 74+ 85 + 98;
		
		int subject = 3; //정수로 저장
		double avg =  (double)sum / (double)subject;// 형변환해서 계산기와 같은 값을 얻을수 있다.
		
		System.out.println("철수의 총점=" +sum);
		System.out.println("철수의 총점=" +avg);
	}

}
