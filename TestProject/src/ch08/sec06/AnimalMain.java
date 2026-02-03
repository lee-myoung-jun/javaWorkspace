package ch08.sec06;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Dog d = new Dog();
		d.sound();
		
		// 다형성 표현
		// 하나의 타입에 여러 객체를 대입할 수 있는 기능
		Animal ap = null;
		
		ap = new Cat(); //Animal에 Cat 객체 참조 대입
		ap.show();  //재정의 객체이므로 자식객체의 메소드가 호출
		ap.sound();
		ap.animalMethod();  //상속된 animail 클래스 메소드 호출
		//ap.CatMethod(); //Animal 클래스에 정의되어 있지 않은 cat의 고유 메소드
		//cat 객체 참조해도 사용 불가
		((Cat)ap).CatMethod();  //강제 형변환
		

		ap = new Dog(); //Animal에 Dog 객체 참조 대입
		ap.show();  //재정의 객체이므로 자식객체의 메소드가 호출
		ap.sound();
		ap.animalMethod();
		((Dog)ap).DogMethod(); //강제 형변환을 통해 sub 클래스 메소드 호출
		
		//자식객체 메소드 사용
		//1. 자식 객체 참조해야 함
		//2. 강제 형변환을 통해 자식 객체 고유 참조 반환 가능
		Dog dg = (Dog)ap;
		dg.DogMethod();
		
		/////////////////////////////
		/// 강제 형변환이 불가능한 예시
		// c 인스턴스 : cat 타입
		// a 인스턴스 : animail 타입
		// a를 cat타입으로 강제 형변환
		// a는 Cat 타입으로 참조하고 있지 않음(강제 형변환 불가능)
		//c = (Cat)a; //문법적 오류는 없지만 실행상태에서 오류가 발생
		//cannot be cast to class
		
		// 오류 발생을 해결하기 위해서 미리 타입검사 진행 후 형변환
		// 객체 instanceof 클래스명   연산자
		// 매개값 타입 조사 할 때 주로 사용하는 연산자
		
		System.out.println(a instanceof Cat); //false
		System.out.println(ap instanceof Dog); //true
		
		//강제 형변환 전 형변환 타입을 참조하는지 확인하고 형변환
		if(a instanceof Cat)
			c=(Cat)a;
	}

}

















