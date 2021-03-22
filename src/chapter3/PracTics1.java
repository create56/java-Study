package chapter3;

public class PracTics1 {

	public static void main(String[] args) {
		double weight = 80;
		double height = 173.1;
		
		double BMI = (weight / (height * height)) * 10000;
		if (BMI > 30) {
			System.out.println("저체중");
		}
		
		if (BMI >= 25 && BMI <= 27 ) {
			System.out.println("정상");
		}

		if (BMI < 24) {
			System.out.println("과체중 의심");
		}
	}

}
