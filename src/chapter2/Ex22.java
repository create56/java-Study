package chapter2;

public class Ex22 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		//3번쨰 자리까지 출력
		double pi1 = pi *1000;
		System.out.println(pi1);
		
		int pi2 = (int) (pi*1000);
		System.out.println(pi2);
		
		double pi3 = (int) (pi* 1000) / 1000.0;
		System.out.println(pi3);
		
		System.out.println((int) pi);
		
		double pi4 = (int) (pi * 1000) / 1000.0;
		System.out.println(pi4);
		
		// 소주점 3쨰 자리에서 반올림 후 출력
		double pi5 = pi * 100;
		System.out.println(pi5);
		
		
		


	}

}
