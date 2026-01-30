package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
	//아래 속성으로는 사용자로부터 데이터 입력할 때 사용
	//면적 계산용으로 사용
	//클래스 속성은 기본값으로 초기화 됨
	private int width;  //public(이 클래스 외에서도 사용가능) <-> private(이 클래스 내에서만 사용가능)
	private int height;
	
	//필드 보호를 위해 필드에 사용자 입력값을 저장하는 메소드
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로길이 입력 : ");
		width = sc.nextInt();
		System.out.print("세로길이 입력 : ");
		height = sc.nextInt();
	}
	
	public void area() {
		System.out.println("사각형 면적 : " + width*height);
	}
	//생성자함수는 개발자가 명시적으로 표현하지 않으면
	//자바가 자동으로 구성함
}
