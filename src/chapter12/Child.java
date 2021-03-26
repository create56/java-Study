package chapter12;

public class Child extends Parent {
	// �θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x 
	public int x;
	public int y;
	
	public Child() {
		this(0,0);
		System.out.println("�Ű������� ���� ������");
	}
	
	// �ڽ� Ŭ������ �ν��Ͻ��� ������� ��
	// �θ� Ŭ������ �ɹ� ���� ���� �����ϹǷ�
	
	// �ڽ� Ŭ������ �����ڸ� ����ٸ�
	// �ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�
	public Child(int x, int y) {
		super(1);
		System.out.println("�Ű������� �ִ� ������");
		this.x = x;
		this.y = y;
	}
	
	// �⺻�����ڸ� ���� �߰��߰�
	// �θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� �ڵ带
	// �ۼ����� �ʴ´�.

	// ��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	// �Ű������� ���� �θ� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�(super)
	
	public void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
	public static void main(String[] args) {
		Child child = new Child();
	}
}
