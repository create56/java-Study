package chapter10;

public class Ex07 {
	// int add -> �޼��尡 �����ϰ� ���� ����� ���� ������� ���� Ÿ���̶�°�
	// add-> �ż����� �̸�
	// () �Ű������� �ʿ���� �޼���
	
	// ��ȯŸ��
	// ���� : byte , int ,short , long
	// �Ǽ� : float , double
	// ���� : char
	// ���ڿ� : String
	int add() {
		int  result = 1 + 1;
		
		return result;
	}
	public static void main(String[] args) {
	Ex07 ex07 = new Ex07();
	
	int result = ex07.add();
	System.out.println(result);

	}

}
