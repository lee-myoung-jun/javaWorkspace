package ch06.sec05;

public class Share {
	int a;
	static int staticA;
	
	/////////////
	/// 메소드
	public void set(int n) {  //인스턴스 메소드
		a += n;
		staticA += n;
	}
	
	public int showA() {  //인스턴스 메소드
		return a;
	}
	
	public static int showStaticA() {  //스태틱 메소드
		return staticA;
	}
}





















