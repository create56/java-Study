package chapter12;

// 3������ ������ ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	
	// this�� ���������� super ������ �ʰ� �޼��带 ȣ��

	@Override // annotation : �ּ�(��ǻ�Ϳ��� �˷��ִ� �ּ�)
	public String getLocation() {
		return super.getLocation() + ", z :" + z; // super : �θ��� ��� ��
		// this�� ���� ó�� ���� �����س��� �ż��带 �ݺ��Ѵ�.
	} 

	
		
	// �������̵� : �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
	
	
}
