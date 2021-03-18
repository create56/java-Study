package chapter2;

public class Ex14 {

	public static void main(String[] args) {
		int var1;
		
		// 1.Ex11타입의 인스턴스를 생성
		// 2.obj1 객체에 저장(꼭 객체라고 불러야 한다.)
		// 3.obj1 메모리 주소를 가지고 있다
		Ex11 obj1 = new Ex11();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "HellWorld~!";
		
		// 1.Ex12타입의 인스턴스를 생성
		// 2.obj2 객체에 저장
		Ex12 obj2 = new Ex12();
		obj2.num1 = 100;
		obj2.num2 = 50;
		
		// 1.Ex13타입의 인스턴스를 생성
		// 2. obj3 객체에 저장
		Ex13 obj3 = new Ex13();
		obj3.num1 =32;
		obj3.num2 = 180.6;
		obj3.var1 = 'A';
		obj3.var2 = "나이키";
		obj3.var3 = "삼성";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		// obj2 객체에 100, 50 정수를 생성하세요
		// obj3 객체에 32,180.6,A,나이키,삼성 변수를 생성하세요
		
		//Today review
		// 클래스라고 하는 나만의 데이터 타입 선언 
		// 클래스를 사용하여 인스턴스 생성 
		// 인스턴스에 데이터를 저장
		// 저장된 데이터를 출력
		
		//예제 Ex13클래스의 인스턴스를 만들고 ex13 객체에 저장하세요
		// Ex13를 위한 이름인데 Ex12이라는 이름을 만들어서 저장하면 안된다
		Ex13 ex13 = new Ex13();
	
		//예제 chulsu 객체를 만들고 Student 클래스의 인스턴스를 저장하세요
		Student chulsu = new Student();
		chulsu.name = "이철수";
		chulsu.age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		
		// 예제 Student 클래스의 인스턴스를 만들고 student객체에 저장하세요
		Student student = new Student();
		
		// 기본값이 출력된다
		System.out.println(student.name);
		System.out.println(student.age);
	}

}
