package ch02.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 참조형 변수 sc 생성
		String name, grade;  // 이름, 학점 각각 문자열 타입 변수 생성
		int year;  // 정수타입 변수인 학년 생성
		double score;  // 실수타입 변수인 점수 생성
		
		//이름 입력후 엔터 치면 name에 문자열로 저장 후 다음으로 이동
		System.out.println("이름 입력 : ");
		name = sc.next();
		
		//학년 입력후 엔터 치면 year에 정수로 저장 후 다음으로 이동
		System.out.println("학년 입력 : ");
		year = sc.nextInt();
		
		//점수 입력후 엔터 치면 score에 실수로 저장 후 다음으로 이동
		System.out.println("점수 입력 : ");
		score = sc.nextDouble();
		
		//학점 입력후 엔터 치면 grade에 문자열로 저장 후 다음으로 이동
		System.out.println("학점 입력 : ");
		grade = sc.next();
		
		
		//각각 결과값 출력
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);

	}

}
