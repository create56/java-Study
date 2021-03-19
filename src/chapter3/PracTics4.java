package chapter3;

public class PracTics4 {
	static final int nowYear = 2021;
	public static void main(String[] args) {
		
		int year = 1992;
		int age = 2021- year;
		
		if (age >= 19) {
			System.out.println("미취학 유아동입니다");
		} else if (8 <= age && age <= 13) {
			System.out.println("초등학생입니다");
		} else if (14 <= age && age <= 17) {
			System.out.println("중학생입니다");
		} else if (17 <= age && age <= 19) {
			System.out.println("고등학생입니다");
		}
	}

}
