package ch08.sec07;

//추상 클래스
public abstract class DrawingObject {
	public String penColor;
	
	//draw() 메소드는 반드시 필요하지만 무슨 기능을 할지는 결정되지 않은 상태
	//추상메소드로 구성 - 상속받은 클래스가 draw(); 메소드 구체화 진행
	public abstract void draw();
	
	public static void main(String[] args) {
		Rect r = new Rect();
		Circle c = new Circle();
		Poly p = new Poly();
		
		r.draw();
		c.draw();
		p.draw();
	}
}






















