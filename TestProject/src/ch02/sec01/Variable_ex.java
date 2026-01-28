package ch02.sec01;

public class Variable_ex {

	public static void main(String[] args) {
		// 기본 문법 : 변수 -> 데이터 타입 변수명 ;
		// 데이터타입-정수 : int
		int value;
		//값이 정해지지 않았다면 써지지 않음
		
		//변수 초기화 (대입)
		//변수명 = 리터럴(실제값)
		value = 10;
		System.out.println(value);
		
		//선언과 동시에 초기화
		int result = 0;
		System.out.println(result);
		result = value + 10;
		
		System.out.println(result);

	}

}
