package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		Student student = new Student();
		student.kor = 56;
		student.eng = 41;
		student.mat = 88;
		student.sum = student.kor + student.eng  + student.mat;
		student.avg = student.sum / student.AMOUNT_OF_SUBJECT;
		// ���� ���� �ٲ�� �����Ҽ� �ֵ��� ����ؾ��Ѵ�.
		
		System.out.println("ö���� ���� =" + student.sum);
		System.out.println("ö���� ��� =" + student.avg);
	}

}
