package chapter2;

import java.util.Arrays;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		
		int[] arr1 = new int[2];
		arr1[0] = num1;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("===========");
		
		Student student = new Student();
		student.name = "김철수";
		
		// 메모리 주소를 복사해서 student변수에 가지고 있다.
		Student[] studentList = new Student[2];
		studentList[0] = student;
		
		student.name = "고영희";
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
	}

}
