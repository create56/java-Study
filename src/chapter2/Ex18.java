package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "����";
		student1.addr = "�λ걤���� �λ����� �߾Ӵ��";
		
		Student student2 = new Student();
		student2.name = "��ö��";
		student2.addr = "�λ걤���� ���� �������";
		
		Student[] studentList = new Student[5]; // �迭�� ������ ����
		
		// 
		studentList[0] = new Student();
		studentList[1] = student1;
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();
		
		System.out.println("�̻� ��");
		System.out.println(studentList[3].addr);
		
		studentList[3].addr = "�λ걤���� �λ����� ��õ��";
		System.out.println("�̻� ��");
		System.out.println(studentList[3].addr);
		
		System.out.println(student2.addr); 
		
		
	}

}
