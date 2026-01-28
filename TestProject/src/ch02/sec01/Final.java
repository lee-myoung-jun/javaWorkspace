package ch02.sec01;

public class Final {

	public static void main(String[] args) {
		// 상수 : final 예약어 사용
		// final 데이터타입 상수명(대문자로 사용) ;
		// 데이터타입-실수 : float, double
		// double > float 느낌이라 float는 뒤에 f 붙이는 대신 할당받는 크기가 적은데 double은 f를 안붙여도 되는 대신 할당받는 크기가 큼
		final float PI = 3.14f;  //실수 리터럴 뒤에 f 추가하여 float 타입임을 알려줘야함
		System.out.println(PI);
		double radius = 10;  //실수 뒤에 예약 문자 없으면 double형
		double circleArea = 0;  
		//double과 float의 크기 차이로 인해 double에는 f를 붙여도 상관없음(포함관계)
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = " + circleArea);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
