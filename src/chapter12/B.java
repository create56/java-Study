package chapter12;

// ����� ������ �θ� Ŭ������ �ִ� ��κ��� �ɹ� ������ �ɹ� �޼��带 ����� ���ִ�.
// �θ� Ŭ������ ���� �Ǿ��ִ� �����ڴ� ��� ���� �� ����.
// private ���� �����ڷ� �Ǿ��ִ� �ɹ� ����, �żҵ�� ����� �ޱ�� ������
// �ڽ� Ŭ������ ������ �� ���� �ɹ��� ���·� ����� �޴´�.
public class B extends A {
	
	public void showNum1() {
		System.out.println(this.num1);
		
		System.out.println(this.getNum2());
		
		System.out.println(this.setNum2());
	}
	
	
}
