package chapter13;

public class Lion extends Animal{
	public Lion() {
		super("����");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + " ��(��)�ι߷� �޸��ϴ�");
		
	}

	@Override
	public void findfood() {
		// TODO Auto-generated method stub
		System.out.println("��ɰ��� �i�ư� ��ҽ��ϴ�");
	}

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub
		System.out.println("��ɰ��� �ͱ��ͱ� �Ծ����ϴ�");
	}
	
	
}
