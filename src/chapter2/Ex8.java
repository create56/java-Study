package chapter2;

public class Ex8 {

	public static void main(String[] args) {
		int[][] student = {
				{84,62,55},
				{93,71,80},
				{52,79,33},
				{42,100,52}		
		};
		
		System.out.println(student[0][0]);
		System.out.println(student[0][1]);
		System.out.println(student[0][2]);
		
		int kor1 = student[0][0];
		
		int[] student1 = student[0];
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);

	}

}
