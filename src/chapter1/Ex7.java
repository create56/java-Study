package chapter1;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char monja = 'A';
		int num = 20;
		double fNum = 17.3149;
								
		// ���ڸ� ������ ��ȯ(��ĳ����)
		int num2 = monja;
		
		// ��ĳ����
		float fNum2 = num;
		
		char var = (char)num;
		
		int sum = 74+ 85 + 98;
		
		int subject = 3; //������ ����
		double avg =  (double)sum / (double)subject;// ����ȯ�ؼ� ����� ���� ���� ������ �ִ�.
		
		System.out.println("ö���� ����=" +sum);
		System.out.println("ö���� ����=" +avg);
	}

}
