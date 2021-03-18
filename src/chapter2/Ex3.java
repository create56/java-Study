package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in); 
		int[] korArr = new int[] { 84,96,52,42};
		int[] korArr1 = new int[4];
		korArr[0] = 88;
		
		System.out.println(Arrays.toString(korArr));
		
		double[] avgArr = new double[] { 67,81.3,54.67,64.67};
		
		System.out.println(Arrays.toString(avgArr));
		
		char[] gradeArr = {'B','A', 'C','D'};
		
		System.out.println(Arrays.toString(gradeArr));

	}

}
