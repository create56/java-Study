package chapter11;

public class Car {

		private int color;
		private int wheel;
		private float speed;
		private double fuel;
		
		public void setColor(int color) {
			this.color = color;
			// ������ �ȿ��� �ٸ� �����ڸ� ȣ���ϴ� ���
			// this(�Ű�����) �� �����ڸ� ȣ���ϴ� ���
			this(1,4,4,0);
			
			System.out.println("�Ű����� ���� �ν��Ͻ��� ���������");
			System.out.println("�� �����ڰ� ó���� ������ �ڵ��");
		}
		
		// ������-> �ν��Ͻ��� ������� ������ �ڵ����� ȣ��Ǵ¸޼���
		// �Ϲ����� �ż��尡 �ƴϹǷ� �̸��� ����������
		// ������ �ż����� �̸��� Ŭ������ �̸��� ���ƾ��Ѵ�
		// ������ �ż���� ��ȯŸ���� ����
		// �������� ���� �����ڴ� public, private �� �ϳ��� �� ���ִ�.
		public Car() {
			// �ν��Ͻ��� ���� ��
			// �ش� �ν��Ͻ��� �츮�� ���ϴ� ���� ���� �ֵ���
			// ���� �Ҽ� ����
			
			//�ڵ����� ���� ù ��° ������ ���� 
			color = 1;
			// ������ ������ 4���� ����
			wheel = 4;
			// �ӷ��� 0
			speed = 0;
			// ���ᷮ�� 0
 			fuel = 0;
			System.out.println("Car Ŭ������ ������ ȣ��");
			
		}
		
		public Car(int color) {
			// this()�� ����ϸ� �����ڸ� ȣ���� �� �ִµ�
			// �����ڸ��� �����ڸ� ȣ���� ���ִ�.
			// �Ϲ����� �ż��� �����ڸ� ȣ�� �Ҽ� ����.
			
			// �ٸ� �����ڸ� ȣ���ϴ� �� �ڵ�� �������� �� ���� ��ġ�ؾ��Ѵ�
			this(color,0.0f,0.0);
			System.out.println("������ ȣ��");
		}
		
		public Car(int color, int wheel) {
			this.color = color;
			this.wheel = wheel;	
			
		}
		public Car(int color,int wheel, float speed) {
			
			this.color = color;
			this.wheel = wheel;
			this.speed = speed;
		}
		
		public Car(int color, int wheel, float speed, double fuel) {
			this.color = color;
			this.wheel = wheel;
			this.speed = speed;
			this.fuel = fuel;
		}
		
		
	

}
