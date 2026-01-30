package ch06.sec01;

public class RectangleMain {

	public static void main(String[] args) {
		// Rectangle class 사용 예시
		Rectangle rec ;
		rec = new Rectangle();  //생성자 함수
		
		//사각형 넓이 계산
		//1. main에서 클래스 객체 속성에 직접 접근 값 저장
		//객체 인스턴스로 private 속성에는 접근 불가
		//rec.height=20;  //private로 설정했기 때문에 여기선 값에 접근 불가능
		//rec.width=10;
		//필드 초기화 없이 메소드 호출
		rec.area();
		
		//2. 클래스 객체 속성에 메소드를 통해 속성에 값 저장
		rec.input();
		rec.area();
		
		//System.out.println(rec.width); //private로 설정했기 때문에 여기선 값에 접근 불가능

	}

}
