package ch02.sec01;

public class Literal {

	public static void main(String[] args) {
		// 리터럴 -> 실제 값 총칭(저장되는 값의 유형을 총칭)
		// 정수/실수/문자(char-'' 이걸로 표현)/문자열(String)/논리(boolean)
		int score = 95; //정수 리터럴
		double average = 88.5;  //실수 리터럴
		
		//문자는 한글자만, 문자열은 여러글자
		char fanilyName = '김';  //문자 리터럴 ""요거 말고 ''요거 사용해야함
		String name = "홍길동";  //문자열 ''요거 말고 "" 요거 써야됨
		boolean result = true;  //논리 리터럴  true/false
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(fanilyName);
		System.out.println(name);
		System.out.println(result);
		
		//변수 사용 범위 : {} 선언된 변수의 가장 가까운 블럭내에서만 사용가능(지역변수 생각하면 될듯?)
	}
		//System.out.println(score); {} 밖이라 오류남
}
