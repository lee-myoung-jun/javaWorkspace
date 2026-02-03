package ch08.sec04;

public class Computer extends Calculator{
	//메소드 재정의 - 정밀도 위해 Math.PI 사용
	//@Override
	//재정의 하려고 했지만 오타때문에 새로운 메소드가 생성되게 됨
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체 areaCircle 실행");
		return Math.PI*r*r;
	}
}




















