package chapter2;

public class Ex14 {

	public static void main(String[] args) {
		int var1;
		
		// 1.Ex11Ÿ���� �ν��Ͻ��� ����
		// 2.obj1 ��ü�� ����(�� ��ü��� �ҷ��� �Ѵ�.)
		// 3.obj1 �޸� �ּҸ� ������ �ִ�
		Ex11 obj1 = new Ex11();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "HellWorld~!";
		
		// 1.Ex12Ÿ���� �ν��Ͻ��� ����
		// 2.obj2 ��ü�� ����
		Ex12 obj2 = new Ex12();
		obj2.num1 = 100;
		obj2.num2 = 50;
		
		// 1.Ex13Ÿ���� �ν��Ͻ��� ����
		// 2. obj3 ��ü�� ����
		Ex13 obj3 = new Ex13();
		obj3.num1 =32;
		obj3.num2 = 180.6;
		obj3.var1 = 'A';
		obj3.var2 = "����Ű";
		obj3.var3 = "�Ｚ";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		// obj2 ��ü�� 100, 50 ������ �����ϼ���
		// obj3 ��ü�� 32,180.6,A,����Ű,�Ｚ ������ �����ϼ���
		
		//Today review
		// Ŭ������� �ϴ� ������ ������ Ÿ�� ���� 
		// Ŭ������ ����Ͽ� �ν��Ͻ� ���� 
		// �ν��Ͻ��� �����͸� ����
		// ����� �����͸� ���
		
		//���� Ex13Ŭ������ �ν��Ͻ��� ����� ex13 ��ü�� �����ϼ���
		// Ex13�� ���� �̸��ε� Ex12�̶�� �̸��� ���� �����ϸ� �ȵȴ�
		Ex13 ex13 = new Ex13();
	
		//���� chulsu ��ü�� ����� Student Ŭ������ �ν��Ͻ��� �����ϼ���
		Student chulsu = new Student();
		chulsu.name = "��ö��";
		chulsu.age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		
		// ���� Student Ŭ������ �ν��Ͻ��� ����� student��ü�� �����ϼ���
		Student student = new Student();
		
		// �⺻���� ��µȴ�
		System.out.println(student.name);
		System.out.println(student.age);
	}

}
