package ch09.sec01;

//인터페이스 구현 클래스에 오버라이딩하는 메소드 원형 추가 : 메뉴 -> source -> override/implement Methods...
//누르고 추가할 것들 선택후 ok 누르면 자동으로 override 해줌
public class SamsungPhone implements ISmartPhone {
	String name;
	
	public SamsungPhone() {
		name = "삼성폰";
	}

	@Override
	public void sendCall() {
		System.out.println(name + "으로 전화를 겁니다");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

}






















