package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		Student student = new Student();
		student.kor = 56;
		student.eng = 41;
		student.mat = 88;
		student.sum = student.kor + student.eng  + student.mat;
		student.avg = student.sum / student.AMOUNT_OF_SUBJECT;
		// 과목에 수가 바뀌면 수정할수 있도록 기억해야한다.
		
		System.out.println("철수의 총점 =" + student.sum);
		System.out.println("철수의 평균 =" + student.avg);
	}

}
