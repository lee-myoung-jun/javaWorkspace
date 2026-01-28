//한개 소스에 여러 클래스가 있을 때는 public 접근 권한자는 한개의 클래스만 가능
//public 클래스는 파일명하고 같아야 하고 그안에 메인이 들어와야함
class A {
	
	
}

class B {
	
	
}

public class Test { // 파일이름하고 적힌거하고 똑같이 적어줘야함(대소문자까지)

	public static void main(String[] args) {
		// main(String[] args) 요거 있는게 프로그램 시작점(실행을 위해서는 반드시 필요)
		// static 이므로 객체 없이 바로 사용가능
		// 실행할 때 런타임(자바)이 main을 호출하는 것부터 시작
		// 출력을 위한 코드
		
		// 문장 마지막 ; 필수 ''이거보다 ""요거 쓰세용
		//println은 div같은 느낌이고 print는 span같은 느낌임 (인라인이냐 블럭이냐 차이)
		
		System.out.println("test"
							+ "");
		
		System.out.println("test 입니다");
		// 한줄주석
		/*
		 * 여러줄 주석
		 * */
		
		{
			//영역 범위 표시(클래스, 메소드, 조건문, 반복문 등)
		}

	}

}
