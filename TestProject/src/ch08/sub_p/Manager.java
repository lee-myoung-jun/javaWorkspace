package ch08.sub_p;

import java.util.Scanner;

import ch08.super_p.Employee; //다른 패키지이므로 import 필요

public class Manager extends Employee {
	//Employee를 상속받았음, 필드는 모두 private이므로 직접 접근 불가능
	//part = "abc";
	//단 필드의 저장 공간은 생성됨
	//Scanner sc = new Scanner(System.in);
	//런타임 예외 발생(키보드 하나로 두개의 객체 참조)
	private String position;  //직위
	
	//Manager 객체 정보 저장 메소드
	//2번 이상 사용하면 sc close 되어버려서 오류 발생
	public void setManager() {
		setEmployee(); //super 클래스메소드호출 일반 직원 정보 저장
		System.out.print("직위 입력 : "); //manager 고유 정보 저장
		position = sc.next();  //여기서 쓰는 sc는 상속받은 참조변수
		//sc.close();
	}
	
	//Manager 객체 정보 출력
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("직위 : " + position);
	}
}



















