package ch08.sec06;

public class Dog extends Animal{
	@Override
	public void show() {
		System.out.println("개 입니다");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void DogMethod() {
		System.out.println("DogMethod 입니다");
	}
}
