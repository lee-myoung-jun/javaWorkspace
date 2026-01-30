package ex;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private int stdNum, year, score; //사용자가 입력한 학번, 학년, 점수의 값을 저장할 정수타입 변수 생성
	private String name;  //사용자가 입력한 성명의 값을 저장할 문자열 타입 변수 생성
	
	public void inputStdInfo() {
		//학생 정보 입력 창 안내
		//사용자가 입력한 값을 각각의 변수에 저장
		System.out.println("****학생 정보 입력****");
		System.out.print("학번 : ");
		stdNum = sc.nextInt();
		System.out.print("성명 : ");
		name = sc.next();
		System.out.print("학년 : ");
		year = sc.nextInt();
		System.out.print("점수 : ");
		score = sc.nextInt();
	}
	
	public void showStdInfo() {
		//학생 정보 출력창 안내
		//각각의 변수에 저장된, 사용자가 입력한 값 출력
		System.out.println("****학생 정보 출력****");
		System.out.println("학번 : " + stdNum);
		System.out.println("성명 : " + name);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
	}

}
