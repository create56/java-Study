package chapter13;

public abstract class Animal {
	private String name;
	private String hungry;
	// ����� ����(0:�ſ���ǰ , 10 ��θ�)
	
	public Animal() {
		this("animal");
	}
	
	public Animal(String name) {
		this.name = name;
	
	}
	
	public String getMyName() {
		return name;
	}
	
	public void run() {
	
	}
	public abstract void findfood();
	public abstract void eatfood();
	
	// �������� ����Ë� ������ ã�Ƽ� �����Ƿ�
	// eat �޼��带 ����ؼ� ������ٸ� (if(hungry <= 5))
	// ������ ã�� �Ե��� �����Ͽ���
	// �̋�, ������ ���� ������ ã�� ����� �� �ٸ��Ƿ� findfood �ż���� �߻�ż���� ����
	// ������ ���� ������ �Դ� ����� �� �ٸ��Ƿ� eatfood�ż���� �߻�޼���� ����
	public void eat() {
		if (hungry <= 5) {
			findfood();
			// ������ ã�´�
			
			// ������ �Դ´�
			System.out.println("������ �Խ��ϴ�");
		}
	}
}
