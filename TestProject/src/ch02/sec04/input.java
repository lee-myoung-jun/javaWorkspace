package ch02.sec04;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// 참조형 변수 sc : 참조형 변수(인스턴스) 선언시 활용 객체 타입으로 선언
		Scanner sc = new Scanner(System.in);  //키보드를 통해 입력된 바이트 코드를 메소드에 따라 형변횐 된 결과값 반환
		int num1, num2;
		
		System.out.println("첫번째 숫자 입력 : ");
		//사용자가 입력 후 enter 넣을때 까지 대기
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		//사용자가 입력 후 enter 넣을때 까지 대기
		num2 = sc.nextInt();
		
		System.out.println("두 수의 합은 : " + (num1 + num2));
		System.out.println("두 수의 곱은 : " + (num1 * num2));
		
		
		
		///문자열 입력 : sc.next();
		
		String grade;
		System.out.println("문자열을 입력하세요");
		grade = sc.next();
		System.out.println(grade);
		
		char grd;
		System.out.println("문자를 입력하세요");
		//grd = sc.next();  //sc는 무조건 문자열 타입으로 반환(글자수 상관없이) - char에 저장 불가능
		//문자열로 입력받은 후에 한문자만 추출 : String.charAt(0) - 첫번째 문자 추출 char 반환
		grd = sc.next().charAt(0);
		System.out.println(grd);
	}

}




















