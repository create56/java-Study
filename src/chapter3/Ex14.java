package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		for (int i = 0; i < number.length(); i++) {
			System.out.println(number.charAt(i));
		}
		
		String a ="Sfasfqafsad";
		System.out.println(a.length()); // ������ ���̸� �˼� �ִ�
		for (int i = 0; i < a.length(); i++) {
			char monja = a.charAt(i);
			
			if (monja == 'a') {
				System.out.println(monja);
			}
		}
		// for���� ����ؼ� a ��ü�� ����ִ� ���ڿ���
		// ó������ ������ �����ؼ� ����ϼ���
		
	}

}
