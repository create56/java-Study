package chapter11;

// Tv�ż���
public class Tv {
	public static void main(String[] args) {
	// �ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ���� ĸ��ȭ, ��������
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	// ��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	// ��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	// ������Ʈ ���� �Ⱓ�� ������� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� ���� ��������
	// ������Ʈ�� ��ü���������� ����� ���踦 �صθ�
	// �������� �ӵ��� ������ ������.
	
	// ���ν��������� �����͸� �����ϸ� �ǹǷ�
	// ������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	// �������� �ӵ��� ������ ��������.
	public Tv() {
		color = "����";
		power = false;
		channel = 1;
	}
	public Tv(String color) {
		this.color = color;
	}
	
	public Tv(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	public String getColor() {
 		return color;
 	}
 	public boolean getpPower() {
 		return power;
 	}
	
	public int getChannel() {
		return channel;
	}
	
	// ���� �޼��� - �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	// 1.������ �Ѱ�
	// 2.���� ä�� ��ȣ�� �˷��ش�.
	void power() {
		power = !power;
		if (power) {
			System.out.println("������ �׽��ϴ�");
		} else {
			System.out.println("������ �����ϴ�");
		} 
	}
	
	void channalUp() {
		channel++;
		showChannel();
	}
	void channelDown() {
		channel--;
		
		showChannel();
	
	}
	public voids showChannel() {
		System.out.println("������ " +channel+ "�Դϴ�");
	  
	}
	
	
	}

}
