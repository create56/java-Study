package chapter13;

public class Person extends Animal {
	public Person() {
		super("���");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + " ��(��)�ι߷� �޸��ϴ�");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	+- -----------------------------------
	@Override
	public void findfood() {
		// TODO Auto-generated method stub
		System.out.println("��޾����� ������ �ֹ��մϴ�");
	}

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub
		System.out.println("������ �߹̾߹� �Խ��ϴ�");
	}
	
	
}
