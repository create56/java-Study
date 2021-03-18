package chapter2;

import java.util.Arrays;

public class PracTice3 {

	public static void main(String[] args) {
		//배열 초기화예시
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		System.out.println(Arrays.toString(avgArr));
		
		avgArr[0] = 78.99;
		avgArr[1] = avgArr[0];
		avgArr[2] = avgArr[1];
		avgArr[3] = avgArr[2];
		System.out.println(Arrays.toString(avgArr));
		double avg = avgArr[0];
		
		

	}

}
